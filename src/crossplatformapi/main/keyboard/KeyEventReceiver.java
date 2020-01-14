package crossplatformapi.main.keyboard;

import crossplatformapi.main.events.Event;
import crossplatformapi.main.events.EventManager;
import crossplatformapi.main.keyboard.event.HotKeyPressedEvent;
import crossplatformapi.main.keyboard.event.KeyPressedEvent;
import crossplatformapi.main.keyboard.event.KeyReleasedEvent;

public class KeyEventReceiver {
	public static void press(long key, long modifier) {
		Event event = new KeyPressedEvent(key, modifier);
		EventManager.callAsync(event);
	}
	
	public static void release(long key, long modifier) {
		Event event = new KeyReleasedEvent(key, modifier);
		EventManager.callAsync(event);
	}
	
	public static void pressHotKey(long id) {
		Event event = new HotKeyPressedEvent((int) id);
		EventManager.callAsync(event);
	}
	
	public static void releaseHotKey(long id) {
		
	}
}
