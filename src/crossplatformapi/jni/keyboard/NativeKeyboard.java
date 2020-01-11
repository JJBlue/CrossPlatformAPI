package crossplatformapi.jni.keyboard;

public class NativeKeyboard {
	public native static boolean registerHotKey(int id, int modifires, int key);
	public native static boolean unregisterHotKey(int id);
	
	public native static short getKeyState(int key);
	
	public native static void pressKey(int key);
	public native static void releaseKey(int key);
	
	public native static String getKeyboardLayout();
	public native static String getPhysicalLayout();
}
