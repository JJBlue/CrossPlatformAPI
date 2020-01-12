package components.map;

import java.util.HashMap;
import java.util.Map;

public class TWMap<E extends Object, T extends Object> {
	
	Map<E, T> map1;
	Map<T, E> map2;
	
	public TWMap() {
		map1 = new HashMap<>();
		map2 = new HashMap<>();
	}
	
	public void put(E k, T v) {
		map1.put(k, v);
		map2.put(v, k);
	}
	
	public void remove1(E k) {
		T v = map1.remove(k);
		map2.remove(v);
	}
	
	public void remove2(T k) {
		E v = map2.remove(k);
		map1.remove(v);
	}
	
	public T get1(E k) {
		return map1.get(k);
	}
	
	public E get2(T k) {
		return map2.get(k);
	}
	
	public Map<E, T> getMap1() {
		return map1;
	}
	
	public Map<T, E> getMap2() {
		return map2;
	}
}