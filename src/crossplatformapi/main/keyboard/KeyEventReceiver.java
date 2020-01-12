package crossplatformapi.main.keyboard;

import crossplatformapi.os.windows.keyboard.WinKeyboard;

public class KeyEventReceiver {
	static WinKeyboard keyboard = new WinKeyboard();//TODO
	
	public static void press(long key, boolean control, boolean windows, boolean alt, boolean shift) {
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
