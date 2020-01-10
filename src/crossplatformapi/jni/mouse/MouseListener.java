package crossplatformapi.jni.mouse;

public class MouseListener {
	public native static void registerListener();
	public native static void unregisterListener();
	
	public native static void block();
	public native static void unblock();
}
