package crossplatformapi.interfaces.keyboard;

import crossplatformapi.main.keyboard.Key;

public interface IKeyboard {
	public int keyToInt(Key key);
	public Key intToKey(int key);
}
