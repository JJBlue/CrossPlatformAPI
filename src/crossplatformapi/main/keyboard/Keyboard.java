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
	
	public static void write(String text) {
		NativeKeyboard.write(text);
	}
	
	public static void registerHotKey(int ID, Key key, ModifierValue modifires) {
		NativeKeyboard.registerHotKey(ID, modifires != null ? modifires.getModifierAsNumber() : 0, getKeyboard().keyToInt(key));
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
	 * register is maybe async?? TODO: Programming in JAVA, because Windows will never return from this function until unregisterKeyListener() will be called
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
