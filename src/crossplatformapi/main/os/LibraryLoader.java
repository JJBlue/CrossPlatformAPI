package crossplatformapi.main.os;

public class LibraryLoader {
	public synchronized static void loadLibrary() {
		OS.getOperatingSystem().loadLibrary();
	}
}
