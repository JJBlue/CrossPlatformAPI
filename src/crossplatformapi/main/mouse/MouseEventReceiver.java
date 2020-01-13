package crossplatformapi.main.mouse;

public class MouseEventReceiver {
	public static void move(long x, long y) {
		System.out.println("Move: " + x + " " + y);
	}
	
	public static void scroll(long delta) {
		System.out.println("Scroll: " + delta);
	}
	
	public static void hscroll(long delta) {
		System.out.println("HScroll: " + delta);
	}
	
	public static void press(int id) {
		System.out.println("press: " + id);
	}
	
	public static void release(int id) {
		System.out.println("Release: " + id);
	}
}
