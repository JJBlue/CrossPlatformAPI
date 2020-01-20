package crossplatformapi;

import crossplatformapi.jni.mouse.NativeMouse;
import crossplatformapi.jni.window.NativeWindow;
import crossplatformapi.jni.window.WindowListener;
import crossplatformapi.main.os.LibraryLoader;

public class test {
	public static void main(String[] args) {
		
		//0000000004070407 1031 1031
		System.out.println("start");
//		System.getProperties().list(System.out);
		
		LibraryLoader.loadLibrary();
		
//		long window = NativeWindow.getWindowInForeground();
//		System.out.println(window);
//		System.out.println(NativeWindow.getTitle(0x360A22));
		
//		for(long l : NativeWindow.getUserWindows()) {
//			System.out.println(NativeWindow.getTitle(l));
//		}
//		
//		System.exit(1);
		
//		try {
//			Thread.sleep(5_000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		NativeKeyboard.write("hello");
//		System.out.println("end");
//		Mouse.hscroll(120);
		
		new Thread(() -> {
//			MouseListener.registerListener();
//			KeyboardListener.registerListener();
			WindowListener.registerListener();
		}).start();
		
		try {
			Thread.sleep(20_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.exit(0);
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












































































