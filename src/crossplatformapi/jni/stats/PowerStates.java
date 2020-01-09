package crossplatformapi.jni.stats;

public class PowerStates {
	public native static void modernStandby(); //S0
	public native static void standby(); //S1-3
	public native static void hibernate(); //S4
	public native static void shutdown(); //S5
	
	public native static void reboot();
	public native static void logoff();
}
