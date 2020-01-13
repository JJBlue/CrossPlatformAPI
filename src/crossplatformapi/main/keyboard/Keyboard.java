package crossplatformapi.main.keyboard;

import crossplatformapi.interfaces.keyboard.IKeyboard;
import crossplatformapi.jni.keyboard.KeyboardListener;
import crossplatformapi.main.os.OS;

public class Keyboard {
	public static void press(Key key) {
		getKeyboard().press(key);
	}
	
	public static void release(Key key) {
		getKeyboard().release(key);
	}
	
	public static void type(Key key) {
		getKeyboard().type(key);
	}
	
	public static String getKeyboarLanguage() {
		return getKeyboard().getKeyboarLanguage();
	}
	
	/**
	 * register is maybe async?? TODO: Programming in JAVA
	 */
	public static void registerKeyListener() {
		KeyboardListener.registerListener();
	}
	
	public static void unregisterKeyListener() {
		KeyboardListener.unregisterListener();
	}
	
	public static void block() {
		KeyboardListener.block();
	}
	
	public static void unblock() {
		KeyboardListener.unblock();
	}
	
	public static IKeyboard getKeyboard() {
		return OS.getOperatingSystem().getKeyboard();
	}
}
