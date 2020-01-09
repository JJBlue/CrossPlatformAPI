package crossplatformapi.jni.stats;

public class NativePowerStates {
	public native void modernStandby(); //S0
	public native void standby(); //S1-3
	public native void hibernate(); //S4
	public native void shutdown(); //S5
}
