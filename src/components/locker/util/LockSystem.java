package components.locker.util;

import java.io.Serializable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import components.locker.exception.LockDeathCodeException;

public class LockSystem implements Serializable {
	private static final long serialVersionUID = -7139368296731143304L;
	
	protected final ReentrantReadWriteLock readWriteLock;
	
	public LockSystem() {
		readWriteLock = new ReentrantReadWriteLock(true); //fair mode: true
	}
	
	public LockSystem(ReentrantReadWriteLock readWriteLock) {
		this.readWriteLock = readWriteLock;
	}
	
	public void writeLock() {
		if(readWriteLock.getReadHoldCount() != 0)
			throw new LockDeathCodeException();
		
		readWriteLock.writeLock().lock();
	}
	
	public void writeUnlock() {
		if(readWriteLock.getWriteHoldCount() > 0)
			readWriteLock.writeLock().unlock();
	}
	
	public void writeUnlockOne() {
		readWriteLock.writeLock().unlock();
	}
	
	public void readLock() {
		if(readWriteLock.getWriteHoldCount() != 0)
			throw new LockDeathCodeException();
		
		readWriteLock.readLock().lock();
	}
	
	public void readUnlock() {
		if(readWriteLock.getReadHoldCount() > 0)
			readWriteLock.readLock().unlock();
	}
	
	public void readUnlockOne() {
		readWriteLock.readLock().unlock();
	}
	
	public ReentrantReadWriteLock getReadWriteLock() {
		return readWriteLock;
	}
}
