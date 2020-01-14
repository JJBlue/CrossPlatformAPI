package crossplatformapi.main.keyboard.event;

import crossplatformapi.main.keyboard.Key;

public class KeyReleasedEvent extends KeyEvent {
	private static final long serialVersionUID = -7174173650564684291L;

	public KeyReleasedEvent(long keycode, long modifier) {
		super(keycode, modifier);
	}
	
	public long getKeyCode() {
		return getKeyCode();
	}
	
	public Key getKey() {
		return getKey();
	}
	
}
