package crossplatformapi.jni.display;

public class NativeDisplay {
	public native static long getPrimaryDisplay();
	public native static long getDisplay(long window);
	public native static long getDisplay(long x, long y);
	public native static long[] getDisplays();
	
	public native static boolean isPrimary(long monitor);
	
	public native static long getX(long monitor);
	public native static long getY(long monitor);
	public native static long getWidth(long monitor);
	public native static long getHeight(long monitor);
	
	/**
	 * @return the workarea of a monitor.
	 * For example Windows is the workarea without the taskbar.
	 * In some cases Workarea is the same as the normal area
	 */
	public native static long getWorkX(long monitor);
	public native static long getWorkY(long monitor);
	public native static long getWorkWidth(long monitor);
	public native static long getWorkHeight(long monitor);
}
