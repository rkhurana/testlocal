/**
 * 
 */
package com.learning.java.generics;

import java.util.List;

/**
 * @author Rohit Khurana
 * 
 */
public class Utils {

	public static <K, V> boolean compair(OrderPair<K, V> o1, OrderPair<K, V> o2) {
		return o1.getKey().equals(o2.getKey())
				&& o1.getValue().equals(o2.getValue());
	}

	public static void sumOfNumbers(List<? extends Number> elements) {
		double sum = 0.0;
		for (Number elem : elements) {
			sum += elem.doubleValue();
		}
		System.out.println("The sum of numbers is " + sum);
	}

	public static void sumOfList(List<?> elements) {
		for (Object elem : elements) {
			System.out.println(elem);
		}
	}

	public static void addNumbers(List<? super Integer> elements) {
		for (int i = 0; i < 10; i++) {
			elements.add(i);
		}
		System.out.println("The list of Numbers are " + elements);
	}
}
