package crossplatformapi.jni.window;

public class NativeWindow {
	/**
	 * @return a id, address or something else to identifiy the window
	 */
	public native static long getWindowInForeground();
	
	public native static long[] getVisibleWindows();
	
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
	
	public native static void maximize(long window);
	public native static void minimize(long window);
	public native static void restore(long window);
	
	public native static void hide(long window);
	public native static void show(long window);
	
	public native static void close(long window);
}
