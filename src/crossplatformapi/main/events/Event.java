package crossplatformapi.main.events;

import java.io.Serializable;

import components.eventmanagers.managerclasses.EventInterface;

public class Event implements Serializable, EventInterface {
	private static final long serialVersionUID = 3914902968001119332L;
	
	private boolean cancel;

	@Override
	public void cancel(boolean wert) {
		cancel = wert;
	}

	@Override
	public boolean isCancelled() {
		return cancel;
	}
}
