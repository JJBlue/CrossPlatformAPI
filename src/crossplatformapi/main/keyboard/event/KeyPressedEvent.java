package crossplatformapi.main.keyboard.event;

import crossplatformapi.main.keyboard.Key;

public class KeyPressedEvent extends KeyEvent {
	private static final long serialVersionUID = -4666992875450258899L;
	
	public KeyPressedEvent(long keycode, long modifier) {
		super(keycode, modifier);
	}
	
	public long getKeyCode() {
		return getKeyCode();
	}
	
	public Key getKey() {
		return getKey();
	}
}
