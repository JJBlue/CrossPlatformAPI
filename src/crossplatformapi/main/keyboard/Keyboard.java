package crossplatformapi.main.keyboard;

import crossplatformapi.interfaces.keyboard.IKeyboard;
import crossplatformapi.main.os.OS;

public class Keyboard {
	//TODO
	
	private static IKeyboard getKeyboard() {
		return OS.getOperatingSystem().getKeyboard();
	}
}
