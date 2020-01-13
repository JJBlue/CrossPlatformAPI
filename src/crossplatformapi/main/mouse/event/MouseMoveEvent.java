package crossplatformapi.main.mouse.event;

public class MouseMoveEvent extends MouseEvent {
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
