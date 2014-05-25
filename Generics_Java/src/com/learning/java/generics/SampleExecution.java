/**
 * 
 */
package com.learning.java.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rohit Khurana
 * 
 */
public class SampleExecution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OrderPair<Integer, String> orderPair1 = new OrderPair<>(25, "Rohit");
		OrderPair<Integer, String> orderPair2 = new OrderPair<>(25, "Rohit");
		System.out.println(Utils.<Integer, String> compair(orderPair1,
				orderPair2)); // type casting can be skipped as complier can
								// infer it directly

		/*
		 * System.out.println(orderPair1.getKey());
		 * System.out.println(orderPair1.getValue());
		 */
		/*
		 * Box<Integer> box = new Box<>(); box.set(10); box.inspect(10L);
		 */

		java.util.ArrayList<Box<Integer>> listOfIntegerBoxes = new java.util.ArrayList<>();
		BoxDemo.addBox(Integer.valueOf(10), listOfIntegerBoxes);
		BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
		BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
		BoxDemo.countBoxes(listOfIntegerBoxes);

		List<Double> li = Arrays.asList(1.1, 2.2, 3.3);
		List<Object> num = new ArrayList<>();
		Utils.sumOfNumbers(li);
		Utils.sumOfList(li);
		Utils.addNumbers(num);
	}

}
