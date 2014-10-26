// PUT YOUR NAME HERE, REPLACING THIS LINE.
// LIST ANY EXTRA CREDIT OPTIONS YOU HAVE IMPLEMENTED HERE, REPLACING THIS LINE.
//
// This file is intended to facilitate developing the extra credit options, but is still needed
// for the project to compile.
// For extra credit options A3E1 and A3E2, implement the following methods of class CustomHashtable:
// clear, containsKey, keySet, get, isEmpty, put, putAll, size
// Use an initial capacity of 11 in your hashtable.
// Automatically rehash to double the capacity when using linear probing and a put operation would make the load factor exceed 0.8.
// If you are implementing option A3E2,
// automatically rehash to a capacity of PRIMEDOUBLE(N) when using quadratic probing and a put operation would make the load factor exceed 0.5.
// Here N is the current capacity, and we define PRIMEDOUBLE(N) to be the smallest prime that is greater than 2N.

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class CustomHashtable<K,V> implements Map {
	boolean linearProbing = true;
	boolean quadraticProbing = false;

	@Override
	public void clear() {
		// TODO Auto-generated method stub		
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub		
	}

	@Override
	public Object remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	} 
	
	public void setCollisionHandlingMethod(int methodNumber) {
		if (methodNumber==0) { linearProbing = true;  quadraticProbing = false; }
		if (methodNumber==1) { linearProbing = false; quadraticProbing = true; }
	}

}
