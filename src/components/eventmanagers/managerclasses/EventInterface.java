package components.eventmanagers.managerclasses;

public abstract interface EventInterface {
	public abstract void cancel(boolean wert);

	public abstract boolean isCancelled();
}
