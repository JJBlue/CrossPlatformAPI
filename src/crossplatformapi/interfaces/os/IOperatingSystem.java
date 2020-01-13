package crossplatformapi.interfaces.os;

import crossplatformapi.interfaces.keyboard.IKeyboard;
import crossplatformapi.interfaces.mouse.IMouse;
import crossplatformapi.main.os.OperatingSystem;

public interface IOperatingSystem {
	public OperatingSystem getOperatingSystem();
	public void loadLibrary();
	
	public IKeyboard getKeyboard();
	public IMouse getMouse();
}
