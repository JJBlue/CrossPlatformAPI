package crossplatformapi.jni.network;

public class NativeNetwork {
	/**
	 * @return if connected to any network
	 */
	public native static boolean isConnected();
	
	public native static String[] getConnectedSSIDs();
	public native static String[] getAllSSIDs();
}
