package crossplatformapi.main.keyboard.event;

import crossplatformapi.main.events.Event;
import crossplatformapi.main.keyboard.Key;

public class KeyEvent extends Event {
	final int keycode;
	final Key key;
	
	public KeyEvent(int keycode, Key key) {
		this.keycode = keycode;
		this.key = key;
	}
	
	int getKeyCode() {
		return keycode;
	}
	
	Key getKey() {
		return key;
	}
}
