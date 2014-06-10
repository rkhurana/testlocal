/**
 * 
 */
package com.learning.java.generics;

/**
 * "K" stands for Key, "V" stands for Value
 * 
 * @author Rohit Khurana
 * 
 */
public interface Pair<K, V> {

	/**
	 * The key.
	 */
	public K getKey();

	public V getValue();
}
