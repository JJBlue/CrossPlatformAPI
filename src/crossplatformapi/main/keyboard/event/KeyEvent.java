package crossplatformapi.main.keyboard.event;

import crossplatformapi.main.events.Event;
import crossplatformapi.main.keyboard.Key;
import crossplatformapi.main.keyboard.Keyboard;

public class KeyEvent extends Event {
	private static final long serialVersionUID = 4123873419383461631L;
	
	int keycode;
	Key key;
	
	KeyEvent() {}
	
	public KeyEvent(int keycode) {
		this.keycode = keycode;
		key = Keyboard.getKeyboard().intToKey(keycode);
	}
		
	int getKeyCode() {
		return keycode;
	}
	
	Key getKey() {
		return key;
	}
}
