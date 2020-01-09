package crossplatformapi.jni.keyboard;

public class NativKeyboard {
	public native boolean registerHotKey(int id, int modifires, int key);
	public native boolean unregisterHotKey(int id);
	
	public native short getKeyState(int key);
	
	public native void startHooking();
	public native void stopHooking();
	
	public native void pressKey(int key);
	public native void releaseKey(int key);
}
