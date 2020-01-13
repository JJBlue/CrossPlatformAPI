package crossplatformapi.main.keyboard.event;

public class HotKeyPressedEvent extends KeyEvent {

	public HotKeyPressedEvent(int id) {
		super(id, null);
	}
	
	public int getID() {
		return getKeyCode();
	}
}
