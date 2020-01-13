package components.async.scheduler;

public interface AsyncExecuter<E extends Object> {
	public abstract void execute(E object);
}
