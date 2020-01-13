package components.locker.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class LockedMap<K, V> extends LockSystem implements Map<K,V>, Serializable {
	private static final long serialVersionUID = -6066149257666941791L;
	
	protected final Map<K, V> map;
	
	protected transient Set<Entry<K, V>> entrySet;
	protected transient Set<K> keySet;
	protected transient Collection<V> values;
	
	public LockedMap(Map<K, V> map) {
		this.map = map;
	}
	
	public void clear() {
		writeLock();
		map.clear();
		writeUnlock();
	}

	@Override
	public boolean containsKey(Object key) {
		readLock();
		boolean tf = map.containsKey(key);
		readUnlock();
		return tf;
	}

	@Override
	public boolean containsValue(Object value) {
		readLock();
		boolean tf = map.containsValue(value);
		readUnlock();
		return tf;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		if(entrySet == null)
			entrySet = new LockedSet<>(map.entrySet(), readWriteLock);
		return entrySet;
	}

	@Override
	public V get(Object key) {
		readLock();
		V result = map.get(key);
		readUnlock();
		return result;
	}

	@Override
	public boolean isEmpty() {
		readLock();
		boolean tf = map.isEmpty();
		readUnlock();
		return tf;
	}

	@Override
	public Set<K> keySet() {
		if(keySet == null)
			keySet = new LockedSet<>(map.keySet(), readWriteLock);
		return keySet;
	}

	@Override
	public V put(K key, V value) {
		writeLock();
		V result = map.put(key, value);
		writeUnlock();
		return result;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		writeLock();
		map.putAll(m);
		writeUnlock();
	}

	@Override
	public V remove(Object key) {
		writeLock();
		V result = map.remove(key);
		writeUnlock();
		return result;
	}

	@Override
	public int size() {
		readLock();
		int result = map.size();
		readUnlock();
		return result;
	}
	
	@Override
	public Collection<V> values() {
		if(values == null)
			values = new LockedCollection<>(map.values(), readWriteLock);
		return values;
	}
}
