package components.eventmanagers.complexmanager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import components.eventmanagers.managerclasses.EventInterface;
import components.eventmanagers.managerclasses.EventPriority;
import components.eventmanagers.managerclasses.Listener;
import components.locker.lock.Locker;

public class PriorityMethodsContainer {
	Map<EventPriority, List<MethodInfo>> pmethods;
	
	public PriorityMethodsContainer() {
		pmethods = Locker.lockedMap(new HashMap<>());
	}

	public void call(EventInterface event) {
		for(EventPriority priority : EventPriority.values()) {
			if(!pmethods.containsKey(priority))
				continue;
			
			List<MethodInfo> minfs = pmethods.get(priority);
			if(minfs == null)
				continue;
			
			for(MethodInfo info : minfs) {
				if(event.isCancelled() && info.eventHandler.ignoreCancelled())
					continue;
				
				info.call(event);
			}
		}
	}

	public void add(MethodInfo info) {
		EventPriority priority = info.eventHandler.priority();
		
		List<MethodInfo> methods = pmethods.get(priority);
		if(methods == null) {
			methods = Locker.lockedList(new LinkedList<>());
			pmethods.put(priority, methods);
		}
		
		methods.add(info);
	}

	public void remove(Listener listener) {
		pmethods.values().removeIf(list -> {
			list.removeIf(info -> {
				return info.listener == listener;
			});
			
			return list.isEmpty();
		});
	}

	public boolean isEmpty() {
		return pmethods.isEmpty();
	}
}
