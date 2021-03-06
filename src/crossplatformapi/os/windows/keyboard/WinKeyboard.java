package crossplatformapi.os.windows.keyboard;

import crossplatformapi.components.TWMap;
import crossplatformapi.interfaces.keyboard.IKeyboard;
import crossplatformapi.main.keyboard.Key;
import crossplatformapi.main.keyboard.Modifier;

public class WinKeyboard implements IKeyboard {
	
	TWMap<Key, Integer> map = new TWMap<>();
	TWMap<Modifier, Integer> modifiers = new TWMap<>();
	
	public WinKeyboard() {
		initKeyboard();
	}
	
	public void initKeyboard() {
		map.put(Key.LBUTTON, 0x01);
		map.put(Key.RBUTTON, 0x02);
		map.put(Key.CANCEL, 0x03);
		map.put(Key.MBUTTON, 0x04);
		map.put(Key.XBUTTON1, 0x05);
		map.put(Key.XBUTTON2, 0x06);
		map.put(Key.BACK, 0x08);
		map.put(Key.TAB, 0x09);
		map.put(Key.CLEAR, 0x0C);
		map.put(Key.RETURN, 0x0D);
		map.put(Key.SHIFT, 0x10);
		map.put(Key.CONTROL, 0x11);
		map.put(Key.MENU, 0x12);
		map.put(Key.PAUSE, 0x13);
		map.put(Key.CAPITAL, 0x14);
		map.put(Key.KANA, 0x15);
		map.put(Key.HANGUEL, 0x15);
		map.put(Key.HANGUL, 0x15);
		map.put(Key.JUNJA, 0x17);
		map.put(Key.FINAL, 0x18);
		map.put(Key.HANJA, 0x19);
		map.put(Key.KANJI, 0x19);
		map.put(Key.ESCAPE, 0x1B);
		map.put(Key.CONVERT, 0x1C);
		map.put(Key.NONCONVERT, 0x1D);
		map.put(Key.ACCEPT, 0x1E);
		map.put(Key.MODECHANGE, 0x1F);
		map.put(Key.SPACE, 0x20);
		map.put(Key.PRIOR, 0x21);
		map.put(Key.NEXT, 0x22);
		map.put(Key.END, 0x23);
		map.put(Key.HOME, 0x24);
		map.put(Key.LEFT, 0x25);
		map.put(Key.UP, 0x26);
		map.put(Key.RIGHT, 0x27);
		map.put(Key.DOWN, 0x28);
		map.put(Key.SELECT, 0x29);
		map.put(Key.PRINT, 0x2A);
		map.put(Key.EXECUTE, 0x2B);
		map.put(Key.SNAPSHOT, 0x2C);
		map.put(Key.INSERT, 0x2D);
		map.put(Key.DELETE, 0x2E);
		map.put(Key.HELP, 0x2F);
		map.put(Key.D0, 0x30);
		map.put(Key.D1, 0x31);
		map.put(Key.D2, 0x32);
		map.put(Key.D3, 0x33);
		map.put(Key.D4, 0x34);
		map.put(Key.D5, 0x35);
		map.put(Key.D6, 0x36);
		map.put(Key.D7, 0x37);
		map.put(Key.D8, 0x38);
		map.put(Key.D9, 0x39);
		map.put(Key.A, 0x41);
		map.put(Key.B, 0x42);
		map.put(Key.C, 0x43);
		map.put(Key.D, 0x44);
		map.put(Key.E, 0x45);
		map.put(Key.F, 0x46);
		map.put(Key.G, 0x47);
		map.put(Key.H, 0x48);
		map.put(Key.I, 0x49);
		map.put(Key.J, 0x4A);
		map.put(Key.K, 0x4B);
		map.put(Key.L, 0x4C);
		map.put(Key.M, 0x4D);
		map.put(Key.N, 0x4E);
		map.put(Key.O, 0x4F);
		map.put(Key.P, 0x50);
		map.put(Key.Q, 0x51);
		map.put(Key.R, 0x52);
		map.put(Key.S, 0x53);
		map.put(Key.T, 0x54);
		map.put(Key.U, 0x55);
		map.put(Key.V, 0x56);
		map.put(Key.W, 0x57);
		map.put(Key.X, 0x58);
		map.put(Key.Y, 0x59);
		map.put(Key.Z, 0x5A);
		map.put(Key.LWIN, 0x5B);
		map.put(Key.RWIN, 0x5C);
		map.put(Key.APPS, 0x5D);
		map.put(Key.SLEEP, 0x5F);
		map.put(Key.NUMPAD0, 0x60);
		map.put(Key.NUMPAD1, 0x61);
		map.put(Key.NUMPAD2, 0x62);
		map.put(Key.NUMPAD3, 0x63);
		map.put(Key.NUMPAD4, 0x64);
		map.put(Key.NUMPAD5, 0x65);
		map.put(Key.NUMPAD6, 0x66);
		map.put(Key.NUMPAD7, 0x67);
		map.put(Key.NUMPAD8, 0x68);
		map.put(Key.NUMPAD9, 0x69);
		map.put(Key.MULTIPLY, 0x6A);
		map.put(Key.ADD, 0x6B);
		map.put(Key.SEPARATOR, 0x6C);
		map.put(Key.SUBTRACT, 0x6D);
		map.put(Key.DECIMAL, 0x6E);
		map.put(Key.DIVIDE, 0x6F);
		map.put(Key.F1, 0x70);
		map.put(Key.F2, 0x71);
		map.put(Key.F3, 0x72);
		map.put(Key.F4, 0x73);
		map.put(Key.F5, 0x74);
		map.put(Key.F6, 0x75);
		map.put(Key.F7, 0x76);
		map.put(Key.F8, 0x77);
		map.put(Key.F9, 0x78);
		map.put(Key.F10, 0x79);
		map.put(Key.F11, 0x7A);
		map.put(Key.F12, 0x7B);
		map.put(Key.F13, 0x7C);
		map.put(Key.F14, 0x7D);
		map.put(Key.F15, 0x7E);
		map.put(Key.F16, 0x7F);
		map.put(Key.F17, 0x80);
		map.put(Key.F18, 0x81);
		map.put(Key.F19, 0x82);
		map.put(Key.F20, 0x83);
		map.put(Key.F21, 0x84);
		map.put(Key.F22, 0x85);
		map.put(Key.F23, 0x86);
		map.put(Key.F24, 0x87);
		map.put(Key.NUMLOCK, 0x90);
		map.put(Key.SCROLL, 0x91);
		map.put(Key.LSHIFT, 0xA0);
		map.put(Key.RSHIFT, 0xA1);
		map.put(Key.LCONTROL, 0xA2);
		map.put(Key.RCONTROL, 0xA3);
		map.put(Key.LMENU, 0xA4);
		map.put(Key.RMENU, 0xA5);
		map.put(Key.BROWSER_BACK, 0xA6);
		map.put(Key.BROWSER_FORWARD, 0xA7);
		map.put(Key.BROWSER_REFRESH, 0xA8);
		map.put(Key.BROWSER_STOP, 0xA9);
		map.put(Key.BROWSER_SEARCH, 0xAA);
		map.put(Key.BROWSER_FAVORITES, 0xAB);
		map.put(Key.BROWSER_HOME, 0xAC);
		map.put(Key.VOLUME_MUTE, 0xAD);
		map.put(Key.VOLUME_DOWN, 0xAE);
		map.put(Key.VOLUME_UP, 0xAF);
		map.put(Key.MEDIA_NEXT_TRACK, 0xB0);
		map.put(Key.MEDIA_PREV_TRACK, 0xB1);
		map.put(Key.MEDIA_STOP, 0xB2);
		map.put(Key.MEDIA_PLAY_PAUSE, 0xB3);
		map.put(Key.LAUNCH_MAIL, 0xB4);
		map.put(Key.LAUNCH_MEDIA_SELECT, 0xB5);
		map.put(Key.LAUNCH_APP1, 0xB6);
		map.put(Key.LAUNCH_APP2, 0xB7);
		map.put(Key.OEM_1, 0xBA);
		map.put(Key.OEM_PLUS, 0xBB);
		map.put(Key.OEM_COMMA, 0xBC);
		map.put(Key.OEM_MINUS, 0xBD);
		map.put(Key.OEM_PERIOD, 0xBE);
		map.put(Key.OEM_2, 0xBF);
		map.put(Key.OEM_3, 0xC0);
		map.put(Key.OEM_4, 0xDB);
		map.put(Key.OEM_5, 0xDC);
		map.put(Key.OEM_6, 0xDD);
		map.put(Key.OEM_7, 0xDE);
		map.put(Key.OEM_8, 0xDF);
		map.put(Key.OEM_102, 0xE2);
		map.put(Key.PROCESSKEY, 0xE5);
		map.put(Key.PACKET, 0xE7);
		map.put(Key.ATTN, 0xF6);
		map.put(Key.CRSEL, 0xF7);
		map.put(Key.EXSEL, 0xF8);
		map.put(Key.EREOF, 0xF9);
		map.put(Key.PLAY, 0xFA);
		map.put(Key.ZOOM, 0xFB);
		map.put(Key.NONAME, 0xFC);
		map.put(Key.PA1, 0xFD);
		map.put(Key.OEM_CLEAR, 0xFE);
		
		modifiers.put(Modifier.ALT, 0x0001);
		modifiers.put(Modifier.CONTROL, 0x0002);
		modifiers.put(Modifier.SHIFT, 0x0004);
		modifiers.put(Modifier.WINDOWS, 0x0008);
		modifiers.put(Modifier.NoRepeat, 0x4000);
	}
	
	@Override
	public int keyToInt(Key key) {
		return map.get1(key);
	}

	@Override
	public Key intToKey(int key) {
		return map.get2(key);
	}

	@Override
	public int modifierToInt(Modifier modifier) {
		return modifiers.get1(modifier);
	}

	@Override
	public Modifier intToModifier(int modifier) {
		return modifiers.get2(modifier);
	}
}
