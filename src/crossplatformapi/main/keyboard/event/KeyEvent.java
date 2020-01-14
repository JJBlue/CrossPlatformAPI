package crossplatformapi.main.keyboard.event;

import crossplatformapi.main.events.Event;
import crossplatformapi.main.keyboard.Key;
import crossplatformapi.main.keyboard.Keyboard;
import crossplatformapi.main.keyboard.ModifierValue;

public class KeyEvent extends Event {
	private static final long serialVersionUID = 4123873419383461631L;
	
	long keycode;
	long modifier;
	Key key;
	
	KeyEvent() {}
	
	public KeyEvent(long keycode, long modifier) {
		this.keycode = keycode;
		key = Keyboard.getKeyboard().intToKey((int) keycode);
	}
		
	long getKeyCode() {
		return keycode;
	}
	
	Key getKey() {
		return key;
	}
	
	ModifierValue modifierValue() {
		return new ModifierValue(modifier);
	}
}
