package crossplatformapi.main.keyboard.event;

public class HotKeyPressedEvent extends KeyEvent {
	private static final long serialVersionUID = 3845080799208166724L;

	public HotKeyPressedEvent(int id) {
		keycode = id;
	}
}
