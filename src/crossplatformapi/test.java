package crossplatformapi;

import crossplatformapi.jni.keyboard.KeyboardListener;
import crossplatformapi.jni.keyboard.NativeKeyboard;
import crossplatformapi.jni.mouse.NativeMouse;
import crossplatformapi.main.keyboard.Key;
import crossplatformapi.main.keyboard.Keyboard;
import crossplatformapi.main.os.LibraryLoader;

public class test {
	public static void main(String[] args) {
//		System.out.println("start");
//		System.getProperties().list(System.out);
		
		LibraryLoader.loadLibrary();
		
		
		try {
			Thread.sleep(1_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		load();
		
//		Mouse.hscroll(120);
		
		//0000000004070407 1031 1031
		
//		new Thread(() -> {
////			MouseListener.registerListener();
//			KeyboardListener.registerListener();
//		}).start();
//		
//		try {
//			Thread.sleep(1_000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		StringBuilder builder = new StringBuilder();
//		
//		for(int i = 0; i < 500; i++) {
//			builder.append("");
//		}
//		
//		NativeKeyboard.write(builder.toString());
//		Keyboard.type(Key.RETURN);
//		
//		try {
//			Thread.sleep(5_000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.exit(0);
	}
	
	public static void load() {
		int round = 0;
		
		int radius = 150;
		
		int mx = 1920 / 2;
		int my = 1080 / 2;
		
		int x = mx - radius;
		int y = my - radius;
		
		int winkel = 0;
		
		NativeMouse.move(x, y);
		
		while(round < 10) {
			
			x = (int) (mx + radius * Math.cos(Math.toRadians(winkel)));
			y = (int) (my + radius * Math.sin(Math.toRadians(winkel)));
			
			NativeMouse.move(x, y);
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			winkel++;
			
			if(winkel == 359) {
				winkel = 0;
				round++;
			}
		}
	}
}


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++












































































