package components.locker.util.iterators;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockedListIterator<E> implements ListIterator<E>, Iterator<E>{

	protected final ListIterator<E> it;
	protected final ReentrantReadWriteLock readWriteLock;
	
	public LockedListIterator(ListIterator<E> it, ReentrantReadWriteLock readWriteLock) {
		this.it = it;
		this.readWriteLock = readWriteLock;
	}
	
	@Override
	public void add(E e) {
		it.add(e);
	}

	@Override
	public boolean hasNext() {
		return it.hasNext();
	}

	@Override
	public boolean hasPrevious() {
		return it.hasPrevious();
	}

	@Override
	public E next() {
		return it.next();
	}

	@Override
	public int nextIndex() {
		return it.nextIndex();
	}

	@Override
	public E previous() {
		return it.previous();
	}

	@Override
	public int previousIndex() {
		return it.previousIndex();
	}

	@Override
	public void remove() {
		it.remove();
	}

	@Override
	public void set(E e) {
		it.set(e);
	}

}
