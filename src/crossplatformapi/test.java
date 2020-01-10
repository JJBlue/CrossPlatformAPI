package crossplatformapi;

import crossplatformapi.jni.keyboard.KeyboardListener;
import crossplatformapi.jni.keyboard.NativeKeyboard;
import crossplatformapi.main.LibraryLoader;

public class test {
	public static void main(String[] args) {
		System.out.println("start");
		LibraryLoader.loadWindows();
//		Mouse.press(0);
		
		new Thread(() -> {
//			MouseListener.registerListener();
			NativeKeyboard.registerHotKey(1, 0, 83);
			KeyboardListener.registerListener();
		}).start();		
		
		try {
			Thread.sleep(5_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.exit(1);
	}
}
