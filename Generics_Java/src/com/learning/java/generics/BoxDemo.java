/**
 * 
 */
package com.learning.java.generics;

/**
 * @author Rohit Khurana
 * 
 */
public class BoxDemo {

	/**
	 * @param u
	 * @param boxes
	 */
	public static <U> void addBox(U u, java.util.List<Box<U>> boxes) {
		Box<U> box = new Box<>();
		box.set(u);
		boxes.add(box);
	}

	/**
	 * Count the boxes.
	 * 
	 * @param boxes
	 */
	public static <U> void countBoxes(java.util.List<Box<U>> boxes) {
		int count = 0;
		for (Box<U> box : boxes) {
			U boxContent = box.get();
			System.out.println("Box # " + count + " conains ["
					+ boxContent.toString() + "]");
			count++;
		}
	}
}
