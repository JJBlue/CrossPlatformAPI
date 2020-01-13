package crossplatformapi.main.keyboard.event;

import crossplatformapi.main.keyboard.Key;

public class KeyReleasedEvent extends KeyEvent {
	private static final long serialVersionUID = -7174173650564684291L;

	public KeyReleasedEvent(int keycode) {
		super(keycode);
	}
	
	public int getKeyCode() {
		return getKeyCode();
	}
	
	public Key getKey() {
		return getKey();
	}
	
}
