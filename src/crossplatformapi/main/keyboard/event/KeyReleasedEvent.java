package crossplatformapi.main.keyboard.event;

import crossplatformapi.main.keyboard.Key;

public class KeyReleasedEvent extends KeyEvent {

	public KeyReleasedEvent(int keycode, Key key) {
		super(keycode, key);
	}
	
	public int getKeyCode() {
		return getKeyCode();
	}
	
	public Key getKey() {
		return getKey();
	}
	
}
