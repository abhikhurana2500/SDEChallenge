package com.paytmlabs.sdechallenge.core;

/**
 * This class provides the implementation for MovingAverage interface.
 * In this implementation, the values added to the data structure are considered to be of Double type.
 * 
 * 
 * @author Abhishek Khurana
 *
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

import com.paytmlabs.sdechallenge.calculateaverage.MovingAverage;

public class MovingAverageImpl implements MovingAverage<Double> {
	// Here 'n' denotes the number of elements from last for which the average needs
	// to be calculated
	private int n;

	// We are taking an arrayList so that we can store all the numbers added and can
	// access them later on
	private List<Double> numList;

	// 'sum' will store the sum of last N digits
	private Double sum;

	public MovingAverageImpl(int n) {
		this.n = n;
		this.numList = new ArrayList<Double>();
		this.sum = 0d;
	}

	public Double calculateMovingAverage() {

		/*
		 * If N > 0 and list contains elements more than or equal to N, then only we can
		 * calculate the average of last N digits. We return null otherwise
		 * 
		 */
		if (n > 0 && (numList.size() > n || numList.size() == n)) {
			// Calculate and return average
			return (sum / n);
		} else if (numList.size() < n) {
			System.out.println("Size of list is " + numList.size() + " which is less than the value of N i.e " + n
					+ ". \nHence, cannot find average of last " + n + " digits");
		}

		// Else return null
		return null;
	}

	public void addElement(Double number) {
		// This function adds a Double element to the List if it is not null

		numList.add(number);
		if (number == null) {
			throw new IllegalArgumentException("Invalid Argument");
		} else if (n > 0) {
			/* Add the element to the sum */
			sum += number;

			/*
			 * If size of the list is greater than N, the first element in the window of N
			 * is subtracted so that the sum now holds the sum of last N digits. In this
			 * way, it will behave like a moving window.
			 * 
			 */
			if (numList.size() > n) {
				sum = sum - numList.get(numList.size() - n - 1);
			}
		}

	}

	public List<Double> getElements() {
		// This function returns the List of numbers
		return numList;
	}

}
