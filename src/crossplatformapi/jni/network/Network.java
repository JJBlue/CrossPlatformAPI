package crossplatformapi.jni.network;

public class Network {
	/**
	 * @return if connected to any network
	 */
	public native static boolean isConnected();
//	public native static String getCurrentNetworkName();
}
