package crossplatformapi.main.window;

import crossplatformapi.main.events.EventManager;
import crossplatformapi.main.window.event.WindowEvent;
import crossplatformapi.main.window.event.WindowForegroundChanged;
import crossplatformapi.main.window.event.WindowMaximizeEvent;
import crossplatformapi.main.window.event.WindowMinimizeEvent;
import crossplatformapi.main.window.event.WindowMoveEvent;
import crossplatformapi.main.window.event.WindowResizeEvent;
import crossplatformapi.main.window.event.WindowRestoreEvent;

public class WindowEventReceiver {
	public static void maximized(long window) {
		WindowEvent event = new WindowMaximizeEvent(window);
		EventManager.callAsync(event);
	}
	
	public static void minimized(long window) {
		WindowEvent event = new WindowMinimizeEvent(window);
		EventManager.callAsync(event);
	}
	
	public static void restore(long window) {
		WindowEvent event = new WindowRestoreEvent(window);
		EventManager.callAsync(event);
	}
	
	/**
	 * Windows use move & resize as one event.
	 * Maybe only called if move started and ended.
	 */
	public static void move(long window) {
		WindowEvent event = new WindowMoveEvent(window);
		EventManager.callAsync(event);
	}
	
	/**
	 * See move(long window) method
	 */
	public static void resize(long window) {
		WindowEvent event = new WindowResizeEvent(window);
		EventManager.callAsync(event);
	}
	
	/**
	 * @param window: Current window in the foreground
	 */
	public static void foregroundChanged(long window) {
		WindowEvent event = new WindowForegroundChanged(window);
		EventManager.callAsync(event);
	}
}
