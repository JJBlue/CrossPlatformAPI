package crossplatformapi.jni.mouse;

public class Mouse {
	//Use java.awt.Robot
	
	public native static void press(int button);
	public native static void release(int button);
	public native static void click(int button);
	
	public native static void move(long x, long y);
}
