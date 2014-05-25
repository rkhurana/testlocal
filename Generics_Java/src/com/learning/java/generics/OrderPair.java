/**
 * 
 */
package com.learning.java.generics;

/**
 * @author Rohit Khurana
 * 
 */
public class OrderPair<K, V> implements Pair<K, V> {

	public K key;
	public V value;

	public OrderPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
