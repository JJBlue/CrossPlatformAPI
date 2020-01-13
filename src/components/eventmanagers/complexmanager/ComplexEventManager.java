package components.eventmanagers.complexmanager;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import components.async.scheduler.AsyncScheduler;
import components.eventmanagers.managerclasses.EventHandler;
import components.eventmanagers.managerclasses.EventInterface;
import components.eventmanagers.managerclasses.Listener;
import components.locker.lock.Locker;

public class ComplexEventManager<L extends Listener, E extends EventInterface> {	
	private Set<L> listeners;
	private Map<Class<?>, PriorityMethodsContainer> methods;
	
	private AsyncScheduler<E> scheduler;
	private AsyncScheduler<AsyncRegister<L>> register;
	
	public ComplexEventManager() {
		listeners = Locker.lockedSet(new HashSet<>());
		methods = Locker.lockedMap(new HashMap<>());
		
		scheduler = new AsyncScheduler<>(5);
		scheduler.setExecuter(asyncevent -> callSync(asyncevent));
		
		register = new AsyncScheduler<>(1);
		register.setExecuter(asynclistener -> {
			if(asynclistener.register)
				register(asynclistener.listener);
			else
				unregister(asynclistener.listener);
		});
	}
	
	public void shutdown() {
		scheduler.shutdown();
		register.shutdown();
	}
	
	public synchronized void clearAll() {
		listeners.clear();
		methods.clear();
	}
	
	public synchronized void registerSync(L l) {
		if(listeners.contains(l))
			return;
		
		listeners.add(l);
		initMethods(l);
	}
	
	public synchronized void unregisterSync(L l) {
		listeners.remove(l);
		deinitMethods(l);
	}
	
	public synchronized void register(L l) {
		if(scheduler.isThreadOfMe())
			registerAsync(l);
		else
			registerSync(l);
	}
	
	public synchronized void unregister(L l) {
		if(scheduler.isThreadOfMe())
			registerAsync(l);
		else
			registerSync(l);
	}
	
	public void callSync(E event) {
		PriorityMethodsContainer priorities = methods.get(event.getClass());
		if(priorities == null)
			return;
		priorities.call(event);
	}
	
	public void call(E event) {
		callAsync(event);
	}
	
	void initMethods(Listener listener) {
		if(listener == null)
			return;
		
		for (Method m : listener.getClass().getMethods()) {
			if(!m.isAnnotationPresent(EventHandler.class))
				continue;
			
			Class<?>[] paramters = m.getParameterTypes();
			if(paramters.length < 1 || !(EventInterface.class.isAssignableFrom(paramters[0])))
				continue;
			
			MethodInfo info = new MethodInfo(m, listener);
			
			PriorityMethodsContainer priorities = methods.get(paramters[0]);
			if(priorities == null) {
				priorities = new PriorityMethodsContainer();
				methods.put(paramters[0], priorities);
			}
			
			priorities.add(info);
		}
	}
	
	void deinitMethods(Listener listener) {
		if(listener == null)
			return;
		
		Set<Class<?>> searched = new HashSet<>();
		
		for (Method m : listener.getClass().getMethods()) {
			if(!m.isAnnotationPresent(EventHandler.class))
				continue;
			
			Class<?>[] paramters = m.getParameterTypes();
			if(paramters.length < 1 || !(EventInterface.class.isAssignableFrom(paramters[0])))
				return;
			
			if(searched.contains(paramters[0]))
				continue;
			
			searched.add(paramters[0]);
			
			PriorityMethodsContainer priorities = methods.get(paramters[0]);
			if(priorities == null)
				continue;
			
			priorities.remove(listener);
			
			if(priorities.isEmpty()) {
				methods.remove(paramters[0]);
			}
		}
	}
	
	public void callAsync(final E event) {
		scheduler.add(event);
	}
	
	public void registerAsync(L listener) {
		register.add(new AsyncRegister<L>(listener, true));
	}
	
	public void unregisterAsync(L listener) {
		register.add(new AsyncRegister<L>(listener, false));
	}
}