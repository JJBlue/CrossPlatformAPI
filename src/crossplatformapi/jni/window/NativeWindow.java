package crossplatformapi.jni.window;

public class NativeWindow {
	/**
	 * @return a id, address or something else to identifiy the window
	 */
	public native static long getWindowInForeground();
	
	/**
	 * @return should return windows, wich are user windows.
	 * For example, the taskbar is not a user window.
	 * Users Windows in Windows are for example all windows, wich are shown in ALT+TAB
	 */
	public native static long[] getUserWindows();
	/**
	 * @return all windows. Could maybe the same result as getUserWindows() in some systems.
	 */
	public native static long[] getAllWindows();
	
	public native static String getTitle(long window);
	
	public native static long getXPosition(long window);
	public native static long getYPosition(long window);
	public native static long getWidth(long window);
	public native static long getHeight(long window);
	
	public native static void setTopMost(long window, boolean value);
	
	public native static void setSize(long window, long width, long height);
	public native static void setPosition(long window, long x, long y);
	
	public native static void toFront(long window);
	public native static void toBack(long window);
	
	public native static boolean isMaximized(long window);
	public native static boolean isMinimized(long window);
	
	public native static void maximize(long window);
	public native static void minimize(long window);
	public native static void restore(long window);
	
	public native static void hide(long window);
	public native static void show(long window);
	
	public native static void close(long window);
}
