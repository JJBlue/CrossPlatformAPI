package crossplatformapi.jni.keyboard;

public class NativeKeyboard {
	public native static boolean registerHotKey(int id, int modifires, int key);
	public native static boolean unregisterHotKey(int id);
	
	public native static boolean isKeyPressed(int key);
	
	public native static void press(int key);
	public native static void release(int key);
	public native static void write(String text);
	
	/*
	 * Keys can be send different as the other methods.
	 * For example Windows send here virtuell keys and not via scancode. Some games doesn't know vk and not work with this
	 */
	public native static void press2(int key);
	public native static void release2(int key);
	
	
	public native static String getKeyboardLayout();
	public native static String getPhysicalLayout();
}
