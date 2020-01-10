package crossplatformapi;

import crossplatformapi.jni.network.Network;
import crossplatformapi.main.LibraryLoader;

public class test {
	public static void main(String[] args) {
		System.out.println("start");
		LibraryLoader.loadWindows();
		System.out.println(Network.isConnected());
		
//		new Thread(() -> {
//			MouseListener.registerListener();
//			KeyboardListener.registerListener();
//		}).start();		
//		
//		try {
//			Thread.sleep(5_000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.exit(1);
	}
}
