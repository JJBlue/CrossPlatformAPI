package components.locker.util.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import components.locker.util.LockSystem;

public class LockedIterator<E> implements Iterator<E> {

	protected final Iterator<E> it;
	protected final LockSystem lockSystem;
	protected final boolean writeAble;
	protected boolean alreadyUnlocked = false;
	
	public LockedIterator(Iterator<E> it, LockSystem lockSystem) {
		this.it = it;
		this.lockSystem = lockSystem;
		writeAble = false;
	}
	
	public LockedIterator(Iterator<E> it, LockSystem lockSystem, boolean writeAble) {
		this.it = it;
		this.lockSystem = lockSystem;
		this.writeAble = writeAble;
	}
	
	@Override
	public boolean hasNext() {
		if(!it.hasNext()) {
			unlock();
			return false;
		}
		return true;
	}

	@Override
	public E next() {
		try {
			return it.next();
		} catch (NoSuchElementException e) {
			unlock();
			throw e;
		}
	}
	
	@Override
	public void remove() {
		it.remove();
	}
	
	public void unlock() {
		if(alreadyUnlocked) return;
		alreadyUnlocked = true;
		
		ReentrantReadWriteLock readWriteLock = lockSystem.getReadWriteLock();
		
		if(!writeAble) {
			if(readWriteLock.getReadHoldCount() > 0) {
				readWriteLock.readLock().unlock();
			}
		} else if(readWriteLock.isWriteLockedByCurrentThread()) {
			readWriteLock.writeLock().unlock();
		}
	}
}
