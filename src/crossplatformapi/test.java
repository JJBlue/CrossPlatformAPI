package crossplatformapi;

import java.lang.annotation.Native;

import crossplatformapi.interfaces.keyboard.Keyboard;
import crossplatformapi.jni.keyboard.NativeKeyboard;
import crossplatformapi.jni.mouse.Mouse;
import crossplatformapi.main.LibraryLoader;

public class test {
	public static void main(String[] args) {
		System.out.println("start");
		LibraryLoader.loadWindows();
		
		//0000000004070407
		//10000000111 000001 0000000111
		//1 7
		NativeKeyboard.getKeyboardLayout();
		
		
//		Mouse.press(0);
		
//		new Thread(() -> {
////			MouseListener.registerListener();
//			NativeKeyboard.registerHotKey(1, 0, 83);
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
