package crossplatformapi.os.windows;

import crossplatformapi.interfaces.keyboard.IKeyboard;
import crossplatformapi.interfaces.mouse.IMouse;
import crossplatformapi.interfaces.os.IOperatingSystem;
import crossplatformapi.main.os.OperatingSystem;
import crossplatformapi.os.windows.keyboard.WinKeyboard;
import crossplatformapi.os.windows.mouse.WinMouse;

public class WinOS implements IOperatingSystem {

	WinKeyboard keyboard = new WinKeyboard();
	WinMouse mouse = new WinMouse();
	boolean loadLibrary;
	
	@Override
	public OperatingSystem getOperatingSystem() {
		return OperatingSystem.WINDOWS;
	}
	
	@Override
	public synchronized void loadLibrary() {
		if(loadLibrary) return;
		loadLibrary = true;
		System.loadLibrary("CrossPlatformAPIWindows");
	}
	
	@Override
	public IKeyboard getKeyboard() {
		return keyboard;
	}

	@Override
	public IMouse getMouse() {
		return mouse;
	}

}
