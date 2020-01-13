package crossplatformapi.main.keyboard.event;

import crossplatformapi.main.keyboard.Key;

public class KeyPressedEvent extends KeyEvent {
	private static final long serialVersionUID = -4666992875450258899L;

	public KeyPressedEvent(int keycode) {
		super(keycode);
	}
	
	public int getKeyCode() {
		return getKeyCode();
	}
	
	public Key getKey() {
		return getKey();
	}
}
