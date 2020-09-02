package crossplatformapi.main.events;

import components.eventmanagers.complexmanager.ComplexEventManager;
import components.eventmanagers.managerclasses.Listener;

public class EventManager {
	private EventManager() {}
	
	private static ComplexEventManager<Listener, Event> manager;
	
	static {
		manager = new ComplexEventManager<>();
	}
	
	public static void register(Listener l) {
		manager.register(l);
	}
	
	public static void unregister(Listener l) {
		manager.unregister(l);
	}
	
	public static void call(Event event) {
		manager.callSync(event);
	}
	
	public static void callAsync(Event event) {
		manager.callAsync(event);
	}
}