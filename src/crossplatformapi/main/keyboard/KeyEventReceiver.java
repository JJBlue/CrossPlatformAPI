package crossplatformapi.main.keyboard;

import crossplatformapi.main.events.Event;
import crossplatformapi.main.events.EventManager;
import crossplatformapi.main.keyboard.event.HotKeyPressedEvent;
import crossplatformapi.main.keyboard.event.KeyPressedEvent;
import crossplatformapi.main.keyboard.event.KeyReleasedEvent;

public class KeyEventReceiver {
	public static void press(long key, boolean control, boolean windows, boolean alt, boolean shift) {
		Event event = new KeyPressedEvent((int) key);
		EventManager.callAsync(event);
	}
	
	public static void release(long key, boolean control, boolean windows, boolean alt, boolean shift) {
		Event event = new KeyReleasedEvent((int) key);
		EventManager.callAsync(event);
	}
	
	public static void pressHotKey(long id) {
		Event event = new HotKeyPressedEvent((int) id);
		EventManager.callAsync(event);
	}
	
	public static void releaseHotKey(long id) {
		
	}
}
