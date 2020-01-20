package crossplatformapi.jni.display;

public class NativeDisplay {
	public native static long getMainDisplay();
	public native static long[] getDisplays();
	
	public native static long getX();
	public native static long getY();
	public native static long getWidth();
	public native static long getHeight();
}
