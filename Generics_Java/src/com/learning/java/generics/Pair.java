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

	public K getKey();

	public V getValue();
}
