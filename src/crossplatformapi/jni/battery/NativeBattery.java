package crossplatformapi.jni.battery;

public class NativeBattery {
	public native static long getCapacityInPercent();
	
	//Indicates that the battery has access to AC power.
	public native static boolean isPowerOnLine();
	
	public native static boolean isBatterySaverOn();
}
