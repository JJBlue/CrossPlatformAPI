package crossplatformapi.main.keyboard.event;

import crossplatformapi.main.keyboard.Key;

public class KeyPressedEvent extends KeyEvent {

	public KeyPressedEvent(int keycode, Key key) {
		super(keycode, key);
	}
	
	public int getKeyCode() {
		return getKeyCode();
	}
	
	public Key getKey() {
		return getKey();
	}
}
