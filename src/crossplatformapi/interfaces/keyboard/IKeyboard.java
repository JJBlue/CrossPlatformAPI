package crossplatformapi.interfaces.keyboard;

import crossplatformapi.main.keyboard.Key;

public interface IKeyboard {
	public int keyToInt(Key key);
	public Key intToKey(int key);
	
	public void press(Key key);
	public void release(Key key);
	
	public void type(Key key);
	
	public String getKeyboarLanguage();
}
