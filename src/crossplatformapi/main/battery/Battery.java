package crossplatformapi.main.battery;

import crossplatformapi.jni.battery.NativeBatteryListener;
import crossplatformapi.jni.battery.NativeBattery;

public class Battery {
	public static long getCapacityInPercent() {
		return NativeBattery.getCapacityInPercent();
	}
	
	//Indicates that the battery has access to AC power.
	public static boolean isPowerOnLine() {
		return NativeBattery.isPowerOnLine();
	}
	
	public static boolean isBatterySaverOn() {
		return NativeBattery.isBatterySaverOn();
	}
	
	public synchronized static void registerListener() {
		NativeBatteryListener.register();
	}
	
	public synchronized static void unregisterListener() {
		NativeBatteryListener.unregister();
	}
}
