package components.locker.util;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockedSet<E> extends LockedCollection<E> implements Set<E> {
	private static final long serialVersionUID = 4117755798639998867L;

	public LockedSet(Collection<E> list) {
		super(list);
	}
	
	public LockedSet(Collection<E> list, ReentrantReadWriteLock readWriteLock) {
		super(list, readWriteLock);
	}
}
