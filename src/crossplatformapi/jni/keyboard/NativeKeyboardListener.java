package crossplatformapi.jni.keyboard;

public class NativeKeyboardListener {
	public native static void register();
	public native static void unregister();
	
	public native static void block();
	public native static void unblock();
}
