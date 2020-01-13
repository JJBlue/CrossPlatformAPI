package crossplatformapi.jni.mouse;

public class NativeMouse {
	public native static void press(int button);
	public native static void release(int button);
	public native static void click(int button);
	
	public native static void move(long x, long y);
	
	public native static void scroll(int delta);
	public native static void hscroll(int delta);
}
