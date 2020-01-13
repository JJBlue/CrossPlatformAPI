package components.eventmanagers.complexmanager;

import components.eventmanagers.managerclasses.Listener;

public class AsyncRegister<L extends Listener> {
	public final L listener;
	public final boolean register;
	
	public AsyncRegister(L listener, boolean register) {
		this.listener = listener;
		this.register = register;
	}
}
