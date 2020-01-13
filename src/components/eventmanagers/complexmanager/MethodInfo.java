package components.eventmanagers.complexmanager;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import components.eventmanagers.managerclasses.EventHandler;
import components.eventmanagers.managerclasses.EventInterface;
import components.eventmanagers.managerclasses.Listener;

public class MethodInfo {
	public final EventHandler eventHandler;
	public final Method method;
	public final Listener listener;
	
	public MethodInfo(Method method, Listener listener) {
		this.method = method;
		this.listener = listener;
		eventHandler = method.getAnnotation(EventHandler.class);
	}
	
	public void call(EventInterface event) {
		try {
			method.invoke(listener, event);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			System.out.println("Class: " + listener.getClass().getName());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.out.println("Class: " + listener.getClass().getName());
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			System.out.println("Class: " + listener.getClass().getName());
		}
	}
}
