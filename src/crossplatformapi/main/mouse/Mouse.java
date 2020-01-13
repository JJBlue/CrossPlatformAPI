package crossplatformapi.main.mouse;

import crossplatformapi.interfaces.mouse.IMouse;
import crossplatformapi.main.os.OS;

public class Mouse {
	//TODO
	
	public static IMouse getKeyboard() {
		return OS.getOperatingSystem().getMouse();
	}
}
