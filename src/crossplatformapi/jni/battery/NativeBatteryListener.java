package crossplatformapi.jni.battery;

public class NativeBatteryListener {
	public native static void register();
	public native static void unregister();
}
