package lab9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class MyHashMap<K,V> implements MapADT{
	public static final int DEFAULT_CAPACITY = 11;
	public static final double DEFAULT_MLF = .75;  
	
	LinkedList<Map.Entry<K,V>>[] table; 
	
	int size;
	
	double maxLoadFactor; 
	
	
	//Default Constructor
	/*MyHashMap(){
		MyHashMap(DEFAULT_CAPACITY, (float)DEFAULT_MLF);
	}*/
	
	MyHashMap(int capacity, float maxLoadFactor){
		this.maxLoadFactor = (double)maxLoadFactor;
		table = (LinkedList<Map.Entry<K,V>> []) new LinkedList[capacity];
		for(int i = 0; i< capacity; i++) {
			
		}
	}
	
	@Override
	public boolean isEmpty() {
		return table.isEmpty();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator entries() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
