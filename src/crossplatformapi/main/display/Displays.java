package crossplatformapi.main.display;

import java.util.LinkedList;
import java.util.List;

import crossplatformapi.jni.display.NativeDisplay;
import crossplatformapi.main.window.Window;

public class Displays {
	public static Display getPrimaryDisplay() {
		return new Display(NativeDisplay.getPrimaryDisplay());
	}
	
	public static Display getDisplay(Window window) {
		return new Display(NativeDisplay.getDisplay(window.getID()));
	}
	
	public static Display getDisplay(long x, long y) {
		return new Display(NativeDisplay.getDisplay(x, y));
	}
	
	public static List<Display> getDisplays() {
		long[] displays = NativeDisplay.getDisplays();
		
		List<Display> list = new LinkedList<>();
		
		for(long id : displays) {
			list.add(new Display(id));
		}
		
		return list;
	}
}
