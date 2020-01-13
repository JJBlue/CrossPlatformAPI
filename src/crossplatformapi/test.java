package crossplatformapi;

import crossplatformapi.main.os.LibraryLoader;

public class test {
	public static void main(String[] args) {
//		System.out.println("start");
		
//		System.getProperties().list(System.out);
		
		try {
			Thread.sleep(4_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		LibraryLoader.loadLibrary();
		
//		Mouse.scroll(-120);
//		Mouse.hscroll(120);
		
//		System.out.println("end");
		
		//0000000004070407 1031 1031
//		NativeKeyboard.getKeyboardLayout();
//		WinKeyboard keyboard = new WinKeyboard();
		
//		new Thread(() -> {
//			MouseListener.registerListener();
////			KeyboardListener.registerListener();
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


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++












































































