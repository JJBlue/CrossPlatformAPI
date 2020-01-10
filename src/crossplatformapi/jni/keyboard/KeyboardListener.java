package crossplatformapi.jni.keyboard;

public class KeyboardListener {
	public native static void registerListener();
	public native static void unregisterListener();
	
	public native static void block();
	public native static void unblock();
}
