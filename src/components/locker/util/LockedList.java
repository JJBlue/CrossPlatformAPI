package components.locker.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class LockedList<E> extends LockedCollection<E> implements List<E>, Collection<E>, Serializable{
	private static final long serialVersionUID = -2844789480911406357L;
	
	final List<E> list;
	
	public LockedList(List<E> list) {
		super(list);
		this.list = list;
	}
	
	@Override
	public void add(int index, E element) {
		writeLock();
		list.add(index, element);
		writeUnlock();
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		writeLock();
		boolean tf = list.addAll(index, c);
		writeUnlock();
		return tf;
	}

	@Override
	public E get(int index) {
		readLock();
		E result = list.get(index);
		readUnlock();
		return result;
	}

	@Override
	public int indexOf(Object o) {
		readLock();
		int result = list.indexOf(o);
		readUnlock();
		return result;
	}

	@Override
	public int lastIndexOf(Object o) {
		readLock();
		int result = list.lastIndexOf(o);
		readUnlock();
		return result;
	}

	@Override
	public ListIterator<E> listIterator() {
		return list.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return list.listIterator(index);
	}

	@Override
	public E remove(int index) {
		System.out.println("called");
		writeLock();
		E result = list.remove(index);
		writeUnlock();
		return result;
	}

	@Override
	public E set(int index, E element) {
		writeLock();
		E result = list.set(index, element);
		writeUnlock();
		return result;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		readLock();
		List<E> result = list.subList(fromIndex, toIndex);
		readUnlock();
		return result;
	}
}
