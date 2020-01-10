package crossplatformapi.main.mouse;

public enum MouseButton {
	LEFT(0),
	RIGHT(1),
	WHEEL(2);
	
	final int value;
	MouseButton(int value) {
		this.value = value;
	}
}
