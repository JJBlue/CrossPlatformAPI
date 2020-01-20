package crossplatformapi.jni.display;

public class NativeDisplay {
	public native long[] getDisplays();
	
	public native long getX();
	public native long getY();
	public native long getWidth();
	public native long getHeight();
}
