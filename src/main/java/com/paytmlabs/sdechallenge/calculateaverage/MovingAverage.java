package com.paytmlabs.sdechallenge.calculateaverage;

/**
 * 
 * This interface allows 3 operations :
 * 1) Providing moving average of the last N elements added 
 * 2) Adding the elements
 * 3) Accessing the elements added
 * 
 * @author Abhishek Khurana
 *
 * @version 1.0
 */

import java.util.List;

public interface MovingAverage<T> {

	/**
	 * Function to return the average of last N digits
	 * 
	 * 
	 * @return the average of last n digits
	 */
	public T calculateMovingAverage();

	/**
	 * Function to add element to the data structure
	 * 
	 */
	public void addElement(T element);

	/**
	 * Function to access elements present in the data structure
	 * 
	 * 
	 * @return List containing the elements
	 */
	public List<T> getElements();

}
