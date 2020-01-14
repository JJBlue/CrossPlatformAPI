package crossplatformapi.interfaces.keyboard;

import crossplatformapi.main.keyboard.Key;
import crossplatformapi.main.keyboard.Modifier;

public interface IKeyboard {
	public int keyToInt(Key key);
	public Key intToKey(int key);
	
	public int modifierToInt(Modifier modifier);
	public Modifier intToModifier(int modifier);
}
