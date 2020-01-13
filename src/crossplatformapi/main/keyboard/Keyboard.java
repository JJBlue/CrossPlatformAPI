package crossplatformapi.main.keyboard;

import crossplatformapi.interfaces.keyboard.IKeyboard;
import crossplatformapi.jni.keyboard.KeyboardListener;
import crossplatformapi.jni.keyboard.NativeKeyboard;
import crossplatformapi.main.os.OS;

public class Keyboard {
	public static void press(Key key) {
		NativeKeyboard.pressKey(getKeyboard().keyToInt(key));
	}
	
	public static void release(Key key) {
		NativeKeyboard.releaseKey(getKeyboard().keyToInt(key));
	}
	
	public static void type(Key key) {
		release(key);
		press(key);
	}
	
	public static void registerHotKey(int ID, Key key, int modifires) { //TODO
		NativeKeyboard.registerHotKey(ID, modifires, getKeyboard().keyToInt(key));
	}
	
	public static void unregisterHotKey(int id) {
		NativeKeyboard.unregisterHotKey(id);
	}
	
	public static boolean isKeyPressed(Key key) {
		return NativeKeyboard.isKeyPressed(getKeyboard().keyToInt(key));
	}
	
	public static String getKeyboarLanguage() {
		return NativeKeyboard.getKeyboardLayout();
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
