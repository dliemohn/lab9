package lab9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class MyHashMap<K, V> implements MapADT {
	public static final int CAPACITY_LEVEL = 0;
	public static final double DEFAULT_MLF = .75;
	public static final int[] CAPACITY_TABLE = {11, 23, 47 ,97 ,197 ,397 ,797 ,1597 ,3203 ,6421 ,12853 ,25717 ,51437 ,102877 ,205759 ,411527 ,823117 ,1646237 ,3292489 ,6584983 ,13169977 ,26339969 ,52679969 ,105359939 ,210719881 ,421439783 ,842879579 ,1685759167 };
	
	LinkedList<Map.Entry<K, V>>[] table;

	int size;

	double maxLoadFactor;

	MyHashMap(int capacity, float maxLoadFactor) {
		this.maxLoadFactor = (double) maxLoadFactor;
		table = (LinkedList<Map.Entry<K, V>>[]) new LinkedList[capacity];
		for (int i = 0; i < capacity; i++) {
			table[i] = new LinkedList();
		}
		size = 0;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < table.length; i++) {
			table[i].clear();
		}

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Object get(Object key) {
		return table[key.hash()];
	}

	@Override
	public Object put(Object key, Object value) {
		Object prev = get(key);
		table[hash(key)].set(0, (Entry<K, V>) value);
		return prev;
	}

	@Override
	public Iterator keys() {
		Iterator i = new Iterator(table);
		return null;
	}

	@Override
	public Iterator entries() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object hash(K key) {
		int code = (int) key % table.length;
		return code;
	}

}
