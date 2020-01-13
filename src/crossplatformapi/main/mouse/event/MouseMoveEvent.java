package crossplatformapi.main.mouse.event;

public class MouseMoveEvent extends MouseEvent {
	private static final long serialVersionUID = -4781404280856650797L;
	
	final long x;
	final long y;
	
	public MouseMoveEvent(long x, long y) {
		this.x = x;
		this.y = y;
	}
	
	public long getX() {
		return x;
	}
	
	public long getY() {
		return y;
	}
}
