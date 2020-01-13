package crossplatformapi.interfaces.mouse;

import crossplatformapi.main.mouse.MouseButton;

public interface IMouse {
	public void move(int x, int y);
	
	public void press(MouseButton button);
	public void release(MouseButton button);
	public void click(MouseButton button);
	
	public void scroll(int dx, int dy);
}
