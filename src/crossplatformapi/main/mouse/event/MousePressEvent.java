package crossplatformapi.main.mouse.event;

import crossplatformapi.main.mouse.MouseButton;

public class MousePressEvent extends MouseEvent {
	private static final long serialVersionUID = 5017355575826836878L;
	
	int buttonCode;
	MouseButton button;
	
	public MousePressEvent(int buttonCode) {
//		this.button = button;
		this.buttonCode = buttonCode;
	}
	
	public MouseButton getButton() {
		return button;
	}
	
	public int getButtonCode() {
		return buttonCode;
	}
}
