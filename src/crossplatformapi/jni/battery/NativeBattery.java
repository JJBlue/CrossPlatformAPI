package crossplatformapi.jni.battery;

public class NativeBattery {
	
	public native static void test();
	
	public native static long getCapacityInPercent();
	
	//Indicates that the battery has access to AC power.
	public native static boolean isPowerOnLine();
	
	public native static boolean isBatterySaverOn();
	public native static void setBatterySaverOn(boolean value);
}