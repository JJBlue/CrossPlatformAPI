package crossplatformapi.main.mouse.event;

import crossplatformapi.main.mouse.MouseButton;

public class MousePressEvent {
	final int buttonCode;
	final MouseButton button;
	
	public MousePressEvent(int buttonCode, MouseButton button) {
		this.button = button;
		this.buttonCode = buttonCode;
	}
	
	public MouseButton getButton() {
		return button;
	}
	
	public int getButtonCode() {
		return buttonCode;
	}
}
