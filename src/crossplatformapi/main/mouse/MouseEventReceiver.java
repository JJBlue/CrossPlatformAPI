package crossplatformapi.main.mouse;

import crossplatformapi.main.events.Event;
import crossplatformapi.main.events.EventManager;
import crossplatformapi.main.mouse.event.MouseHScrollEvent;
import crossplatformapi.main.mouse.event.MouseMoveEvent;
import crossplatformapi.main.mouse.event.MousePressEvent;
import crossplatformapi.main.mouse.event.MouseReleaseEvent;
import crossplatformapi.main.mouse.event.MouseScrollEvent;

public class MouseEventReceiver {
	public static void move(long x, long y) {
		Event event = new MouseMoveEvent(x, y);
		EventManager.callAsync(event);
	}
	
	public static void scroll(long delta) {
		Event event = new MouseScrollEvent(delta);
		EventManager.callAsync(event);
	}
	
	public static void hscroll(long delta) {
		Event event = new MouseHScrollEvent(delta);
		EventManager.callAsync(event);
	}
	
	public static void press(int id) {
		Event event = new MousePressEvent(id);
		EventManager.callAsync(event);
	}
	
	public static void release(int id) {
		Event event = new MouseReleaseEvent(id);
		EventManager.callAsync(event);
	}
}
