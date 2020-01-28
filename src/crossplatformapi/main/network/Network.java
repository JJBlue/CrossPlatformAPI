package crossplatformapi.main.network;

import crossplatformapi.jni.network.NativeNetwork;

public class Network {
	/**
	 * @return if connected to any network
	 */
	public static boolean isConnected() {
		return NativeNetwork.isConnected();
	}
	
	public static String[] getConnectedSSIDs() {
		return NativeNetwork.getConnectedSSIDs();
	}
	
	public static String[] getAllSSIDs() {
		return NativeNetwork.getAllSSIDs();
	}
}
