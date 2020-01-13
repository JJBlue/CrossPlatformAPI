package crossplatformapi.interfaces.mouse;

import crossplatformapi.main.mouse.MouseButton;

public interface IMouse {
	public int buttonToInt(MouseButton key);
	public MouseButton intToButton(int key);
}
