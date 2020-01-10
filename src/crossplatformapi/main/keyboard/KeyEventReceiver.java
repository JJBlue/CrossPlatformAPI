package crossplatformapi.main.keyboard;

public class KeyEventReceiver {
	public static void hookedKey(int code, int wparam, int lparam) {
//		System.out.println("#" + code + " " + wparam + " " + lparam);
	}
	
	public static void hookedHotKey(int id, int message) {
		
	}
	
	public static void hookedHotKey(int id, int message, int key, int modifires) {
		
	}
}
