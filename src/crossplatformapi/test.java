package crossplatformapi;

import components.eventmanagers.managerclasses.EventHandler;
import crossplatformapi.jni.mouse.NativeMouse;
import crossplatformapi.main.display.Display;
import crossplatformapi.main.display.Displays;
import crossplatformapi.main.os.LibraryLoader;

public class test {
	@EventHandler
	public static void main(String[] args) {
		
		//0000000004070407 1031 1031
		System.out.println("start");
//		System.getProperties().list(System.out);
		
		LibraryLoader.loadLibrary();
//		mouseMoveInCircle();		
		
//		GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
//		GraphicsDevice[] devices = g.getScreenDevices();
//
//		for (int i = 0; i < devices.length; i++) {
//		    System.out.println("Width:" + devices[i].getFullScreenWindow());
//		    System.out.println("Height:" + devices[i].getDisplayMode().getHeight());
//		}
		
		System.out.println(Long.MIN_VALUE);
		
		for(Display l : Displays.getDisplays()) {
			System.out.println(l.getWidth());
			System.out.println(l.getBrightness());
			System.out.println(l.getMinBrightness());
			System.out.println(l.getMaxBrightness());
		}
		
		
		
//		Mouse.hscroll(120);
		
//		new Thread(() -> {
////			MouseListener.registerListener();
////			KeyboardListener.registerListener();
//			WindowListener.registerListener();
//		}).start();
//		
//		try {
//			Thread.sleep(20_000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.exit(0);
	}
	
	public static void mouseMoveInCircle() {
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












































































