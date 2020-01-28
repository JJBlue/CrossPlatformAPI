package crossplatformapi.main.window;

import java.util.LinkedList;
import java.util.List;

import crossplatformapi.jni.window.NativeWindow;
import crossplatformapi.jni.window.NativeWindowListener;

public class Windows {
	public static Window getWindowInForeground() {
		return new Window(NativeWindow.getWindowInForeground());
	}
	
	/**
	 * @return should return windows, which are user windows.
	 * For example, the taskbar is not a user window.
	 * Users Windows in Windows are for example all windows, which are shown in ALT+TAB
	 */
	public static List<Window> getUserWindows() {
		List<Window> list = new LinkedList<>();
		
		for(long id : NativeWindow.getUserWindows()) {
			list.add(new Window(id));
		}
		
		return list;
	}
	
	/**
	 * @return all windows. Could maybe the same result as getUserWindows() in some systems.
	 */
	public static List<Window> getAllWindows() {
		List<Window> list = new LinkedList<>();
		
		for(long id : NativeWindow.getAllWindows()) {
			list.add(new Window(id));
		}
		
		return list;
	}
	
	public static void registerListener() {
		NativeWindowListener.register();
	}
	
	public static void unregisterListener() {
		NativeWindowListener.unregister();
	}
}
