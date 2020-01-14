package crossplatformapi.main.keyboard.write;

import components.map.TWMap;
import crossplatformapi.main.keyboard.Key;
import crossplatformapi.main.keyboard.Keyboard;
import crossplatformapi.main.os.LibraryLoader;

/**
 * Test Class to write Strings
 *
 */
public class TypeKeyboard {
	public static TWMap<KeyCombination, Character> kc;
	
	public static void main(String[] args) {
//		for(int i = 0; i < 26; i++) {
//			System.out.println("kc.put(new KeyCombination(Key." + (char) ('A' + i) + "), '" + (char) ('a' + i) +"');");
//		}
//		
//		System.out.println(Key.A);
		
		LibraryLoader.loadLibrary();
		
		try {
			Thread.sleep(2_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		load();
		write("Hamster sind die ... der Erde");
	}
	
	static {
		kc = new TWMap<>();
	}
	
	public static void write(String text) {
		for(char c : text.toCharArray()) {
			KeyCombination combination = kc.get2(c);
			if(combination == null)
				continue;
			
			for(Key key : combination.keys) {
				Keyboard.press(key);
			}
			
			for(Key key : combination.keys) {
				Keyboard.release(key);
			}
		}
	}
	
	private static void load() {
		for(int i = 0; i < 26; i++) {
			kc.put(new KeyCombination(Key.valueOf( ((char) ('A' + i)) + "")), (char) ('a' + i));
		}
		
		for(int i = 0; i < 26; i++) {
			kc.put(new KeyCombination(Key.SHIFT, Key.valueOf( ((char) ('A' + i)) + "")), (char) ('A' + i));
		}
		
		kc.put(new KeyCombination(Key.TAB), '\t');
		kc.put(new KeyCombination(Key.RETURN), '\n');
		kc.put(new KeyCombination(Key.SPACE), ' ');
		
		kc.put(new KeyCombination(Key.SHIFT, Key.OEM_PERIOD), '.');
	}
}
