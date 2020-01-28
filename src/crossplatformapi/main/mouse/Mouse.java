package crossplatformapi.main.mouse;

import crossplatformapi.interfaces.mouse.IMouse;
import crossplatformapi.jni.mouse.NativeMouseListener;
import crossplatformapi.jni.mouse.NativeMouse;
import crossplatformapi.main.os.OS;

public class Mouse {
	
	public static void press(MouseButton button) {
		NativeMouse.press(getMouse().buttonToInt(button));
	}
	
	public static void release(MouseButton button) {
		NativeMouse.release(getMouse().buttonToInt(button));
	}
	
	public static void click(MouseButton button) {
		NativeMouse.click(getMouse().buttonToInt(button));
	}
	
	public static void move(long x, long y) {
		NativeMouse.move(x, y);
	}
	
	public static void scroll(int delta) {
		NativeMouse.scroll(delta);
	}
	
	public static void hscroll(int delta) {
		NativeMouse.hscroll(delta);
	}
	
	public static void registerListener() {
		NativeMouseListener.register();
	}
	
	public static void unregisterListener() {
		NativeMouseListener.unregister();
	}
	
	public static void block() {
		NativeMouseListener.block();
	}
	
	public static void unblock() {
		NativeMouseListener.unblock();
	}
	
	public static IMouse getMouse() {
		return OS.getOperatingSystem().getMouse();
	}
}
