package crossplatformapi;

import crossplatformapi.jni.mouse.NativeMouse;

public class test {
	public static void main(String[] args) {
//		System.out.println("start");
		
		System.getProperties().list(System.out);
		
//		LibraryLoader.loadLibrary();
//		
//		try {
//			Thread.sleep(1_000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		load();
//		
//		System.out.println("end");
		
		
		
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












































































