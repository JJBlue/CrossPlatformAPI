package crossplatformapi.main.mouse.event;

import crossplatformapi.main.mouse.MouseButton;

public class MouseReleaseEvent extends MouseEvent {
	private static final long serialVersionUID = -2867289076613876705L;
	
	int buttonCode;
	MouseButton button;
	
	public MouseReleaseEvent(int buttonCode) {
//		this.button = Mouse.getMouse();//TODO
		this.buttonCode = buttonCode;
	}
	
	public MouseButton getButton() {
		return button;
	}
	
	public int getButtonCode() {
		return buttonCode;
	}
}
