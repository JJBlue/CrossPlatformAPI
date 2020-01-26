package crossplatformapi.jni.battery;

public class NativeBattery {
	
	public native static long getMinimumCapacity();
	public native static long getCapacity();
	public native static long getMaximumCapacity();
	
	public native static boolean isCharging();
	public native static boolean isDischarging();
	public native static boolean isCritical();
	
	//Indicates that the battery has access to AC power.
	public native static boolean isPowerOnLine();
}
