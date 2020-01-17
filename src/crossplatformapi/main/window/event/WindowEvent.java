package crossplatformapi.main.window.event;

import crossplatformapi.main.events.Event;

public class WindowEvent extends Event {
	private static final long serialVersionUID = -6032354097617720723L;
	
	public final long window;
	
	public WindowEvent(long window) {
		this.window = window;
	}
	
	public long getWindow() {
		return window;
	}
}
