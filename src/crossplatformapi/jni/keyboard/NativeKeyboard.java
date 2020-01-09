package crossplatformapi.jni.keyboard;

public class NativeKeyboard {
	public native boolean registerHotKey(int id, int modifires, int key);
	public native boolean unregisterHotKey(int id);
	
	public native short getKeyState(int key);
	
	public native void pressKey(int key);
	public native void releaseKey(int key);
}
