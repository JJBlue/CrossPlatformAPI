package crossplatformapi;

import crossplatformapi.main.LibraryLoader;

public class test {
	public static void main(String[] args) {
		System.out.println("start");
		LibraryLoader.loadWindows();
		
		//0000000004070407 1031 1031
//		NativeKeyboard.getKeyboardLayout();
//		WinKeyboard keyboard = new WinKeyboard();
		
//		new Thread(() -> {
//			MouseListener.registerListener();
//			NativeKeyboard.registerHotKey(1, 0, 83);
//			KeyboardListener.registerListener();
//		}).start();
		
		try {
			Thread.sleep(5_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.exit(1);
	}
}
