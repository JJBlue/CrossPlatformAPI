package crossplatformapi.interfaces.keyboard;

import crossplatformapi.main.keyboard.Key;

public interface Keyboard {
	public void press(Key key);
	public void release(Key key);
	
	public void type(Key key);
	
	public void createKeyListener();
	public void deleteKeyListener();
}
