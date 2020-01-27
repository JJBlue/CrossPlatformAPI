package crossplatformapi.jni.display;

public class NativeDisplay {
	public native static long getPrimaryDisplay();
	public native static long getDisplay(long window);
	public native static long getDisplay(long x, long y);
	public native static long[] getDisplays();
	
	public native static boolean isPrimary(long display);
	
	public native static long getX(long display);
	public native static long getY(long display);
	public native static long getWidth(long display);
	public native static long getHeight(long display);
	
	/**
	 * @return the workarea of a monitor.
	 * For example Windows is the workarea without the taskbar.
	 * In some cases Workarea is the same as the normal area
	 */
	public native static long getWorkX(long display);
	public native static long getWorkY(long display);
	public native static long getWorkWidth(long display);
	public native static long getWorkHeight(long display);
	
	public native static void setBrightness(long display, long brightness);
	
	public native static long getBrightness(long display);
	public native static long getMinBrightness(long display);
	public native static long getMaxBrightness(long display);
	
	public native static void turnOffMonitors();
	public native static void turnOnMonitors();
}
