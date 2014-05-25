/**
 * 
 */
package com.learning.java.generics;

/**
 * 
 * Generic version of the Box class.
 * 
 * @param <T>
 *            the type of the value being boxed
 * 
 * @author Rohit Khurana
 * 
 */
public class Box<T> {

	private T t; // T stands for "Type" and rohit

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public <U extends Number> void inspect(U u) {
		System.out.println("T--->" + t.getClass().getName());
		System.out.println("U--->" + u.getClass().getName());
	}

}
