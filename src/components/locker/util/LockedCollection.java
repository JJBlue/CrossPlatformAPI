package components.locker.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import components.locker.util.iterators.LockedIterator;

public class LockedCollection<E> extends LockSystem implements Collection<E> {
	private static final long serialVersionUID = 9079799766726663006L;
	
	protected final Collection<E> c;
	
	public LockedCollection(Collection<E> c) {
		this.c = c;
	}
	
	public LockedCollection(Collection<E> c, ReentrantReadWriteLock readWriteLock) {
		super(readWriteLock);
		this.c = c;
	}
	
	@Override
	public boolean add(E e) {
		writeLock();
		boolean tf = c.add(e);
		writeUnlock();
		return tf;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		writeLock();
		this.c.addAll(c);
		writeUnlock();
		return false;
	}

	@Override
	public void clear() {
		writeLock();
		c.clear();
		writeUnlock();
	}

	@Override
	public boolean contains(Object o) {
		readLock();
		boolean tf = c.contains(o);
		readUnlock();
		return tf;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		readLock();
		boolean tf = c.containsAll(c);
		readUnlock();
		return tf;
	}

	@Override
	public boolean isEmpty() {
		readLock();
		boolean tf = c.isEmpty();
		readUnlock();
		return tf;
	}

	@Override
	public LockedIterator<E> iterator() {
		readLock();
		return new LockedIterator<>(c.iterator(), this);
	}
	
	public Iterator<E> writeIterator(){
		writeLock();
		return new LockedIterator<>(c.iterator(), this, true);
	}

	@Override
	public boolean remove(Object o) {
		writeLock();
		boolean tf = c.remove(o);
		writeUnlock();
		return tf;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		writeLock();
		boolean tf = c.removeAll(c);
		writeUnlock();
		return tf;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		writeLock();
		boolean tf = c.retainAll(c);
		writeUnlock();
		return tf;
	}

	@Override
	public int size() {
		readLock();
		int result = c.size();
		readUnlock();
		return result;
	}

	@Override
	public Object[] toArray() {
		readLock();
		Object[] result = c.toArray();
		readUnlock();
		return result;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		readLock();
		T[] result = c.toArray(a);
		readUnlock();
		return result;
	}

	public boolean equals(Object o) {
        if (this == o)
            return true;
        synchronized (this) {return c.equals(o);}
    }
    public int hashCode() {
        synchronized (this) {return c.hashCode();}
    }
}
