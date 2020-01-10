package crossplatformapi.main.keyboard;

public class KeyEventReceiver {
	public static void press(long key, boolean alt, boolean shift, boolean windows, boolean steuerung) {
		System.out.println("Press: " + key);
	}
	
	public static void release(long key, boolean alt, boolean shift, boolean windows, boolean steuerung) {
		System.out.println("Release: " + key);
	}
	
	public static void pressHotKey(long id) {
		
	}
	
	public static void releaseHotKey(long id) {
		
	}
}
