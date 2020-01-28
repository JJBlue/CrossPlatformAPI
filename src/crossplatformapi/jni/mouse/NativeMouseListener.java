package crossplatformapi.jni.mouse;

public class NativeMouseListener {
	public native static void register();
	public native static void unregister();
	
	public native static void block();
	public native static void unblock();
}
