package crossplatformapi.os.windows.mouse;

import components.map.TWMap;
import crossplatformapi.interfaces.mouse.IMouse;
import crossplatformapi.main.mouse.MouseButton;

public class WinMouse implements IMouse {
	TWMap<MouseButton, Integer> map = new TWMap<>();
	
	public WinMouse() {
		init();
	}
	
	public void init() {
		map.put(MouseButton.LEFT, 0x01);
		map.put(MouseButton.RIGHT, 0x02);
		map.put(MouseButton.MIDDLE, 0x04);
		map.put(MouseButton.XBUTTON1, 0x05);
		map.put(MouseButton.XBUTTON2, 0x06);
	}

	@Override
	public int buttonToInt(MouseButton key) {
		return map.get1(key);
	}

	@Override
	public MouseButton intToButton(int key) {
		return map.get2(key);
	}
}
