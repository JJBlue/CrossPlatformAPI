package components.locker.lock;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import components.locker.util.LockedCollection;
import components.locker.util.LockedList;
import components.locker.util.LockedMap;
import components.locker.util.LockedSet;

public class Locker {
	public static <E, T> LockedMap<E, T> lockedMap(Map<E, T> map){
		return new LockedMap<>(map);
	}
	
	public static <E> LockedList<E> lockedList(List<E> list){
		return new LockedList<>(list);
	}
	
	public static <E> LockedSet<E> lockedSet(Set<E> set){
		return new LockedSet<>(set);
	}
	
	public static <E> LockedCollection<E> lockedCollection(Collection<E> c){
		return new LockedCollection<>(c);
	}
}
