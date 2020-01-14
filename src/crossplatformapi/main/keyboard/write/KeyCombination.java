package crossplatformapi.main.keyboard.write;

import crossplatformapi.main.keyboard.Key;

public class KeyCombination {
	Key[] keys;
	
	public KeyCombination(Key... keys) {
		this.keys = keys;
	}
	
	public Key[] getCombination() {
		return keys;
	}
}
