package crossplatformapi.main.keyboard;

import crossplatformapi.main.events.Event;
import crossplatformapi.main.keyboard.event.KeyPressedEvent;
import crossplatformapi.os.windows.keyboard.WinKeyboard;

public class KeyEventReceiver {
	static WinKeyboard keyboard = new WinKeyboard();//TODO
	
	public static void press(long key, boolean control, boolean windows, boolean alt, boolean shift) {
//		Event event = new KeyPressedEvent(key, );
		System.out.println("Press: " + key + " " + keyboard.intToKey((int) key));
	}
	
	public static void release(long key, boolean control, boolean windows, boolean alt, boolean shift) {
		System.out.println("Release: " + key + " " + keyboard.intToKey((int) key));
	}
	
	public static void pressHotKey(long id) {
		
	}
	
	public static void releaseHotKey(long id) {
		
	}
}
