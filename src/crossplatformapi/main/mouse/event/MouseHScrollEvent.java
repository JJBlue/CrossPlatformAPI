package crossplatformapi.main.mouse.event;

public class MouseHScrollEvent extends MouseEvent {
	private static final long serialVersionUID = -3049802585548475326L;

	long scroll;
	
	public MouseHScrollEvent(long scroll) {
		this.scroll = scroll;
	}
	
	public long getScrollDelta() {
		return scroll;
	}
}
