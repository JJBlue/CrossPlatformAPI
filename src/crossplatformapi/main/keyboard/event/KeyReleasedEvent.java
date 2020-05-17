package crossplatformapi.main.keyboard.event;

public class KeyReleasedEvent extends KeyEvent {
	private static final long serialVersionUID = -7174173650564684291L;

	public KeyReleasedEvent(long keycode, long modifier) {
		super(keycode, modifier);
	}
}
