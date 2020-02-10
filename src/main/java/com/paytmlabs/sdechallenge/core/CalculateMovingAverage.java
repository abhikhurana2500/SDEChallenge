package com.paytmlabs.sdechallenge.core;

/**
 * This is the driver class which uses the implementation class to add elements,
 * calculate moving average and access elements added. The elements added are of
 * Double type
 * 
 * @author Abhishek Khurana
 *
 * @version 1.0
 */

public class CalculateMovingAverage {

	public static void main(String[] args) {
		int window = 3; // This is same as 'N' in the question
		MovingAverageImpl movingAverageImpl = new MovingAverageImpl(window);
		// Adding the elements
		movingAverageImpl.addElement(1d);
		movingAverageImpl.addElement(2d);
		movingAverageImpl.addElement(3d);
		// Calculating Average
		System.out.println("Average is : " + movingAverageImpl.calculateMovingAverage());

		// Adding more elements
		movingAverageImpl.addElement(4d);
		movingAverageImpl.addElement(5d);
		// Calculating Average
		System.out.println("Average is : " + movingAverageImpl.calculateMovingAverage());

		// Adding more elements
		movingAverageImpl.addElement(6d);
		movingAverageImpl.addElement(7d);
		movingAverageImpl.addElement(8d);
		// Calculating Average
		System.out.println("Average is : " + movingAverageImpl.calculateMovingAverage());

		// Accessing all the elements added
		System.out.println(movingAverageImpl.getElements());

	}
}
