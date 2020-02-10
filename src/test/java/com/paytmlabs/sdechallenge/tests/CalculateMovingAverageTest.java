package com.paytmlabs.sdechallenge.tests;

/**
 * This is the test  class which is used to test different scenarios for the 3 operations : 
 * 1) Adding elements 
 * 2) Calculating moving average 
 * 3) Accessing elements added
 * 
 * @author Abhishek Khurana
 *
 * @version 1.0
 */

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.paytmlabs.sdechallenge.core.MovingAverageImpl;

public class CalculateMovingAverageTest {

	private MovingAverageImpl movingAverageImpl;

	/*
	 * Creating the object here with size of N as 3. This object will be created
	 * before each test case
	 */
	@Before
	public void init() {
		movingAverageImpl = new MovingAverageImpl(3);
	}

	// Test to check the count of elements added and being retrieved are same
	@Test
	public void addElementOneTest() {
		movingAverageImpl.addElement(1d);
		assertEquals(1, movingAverageImpl.getElements().size());
	}

	// Test to check the moving average is correct if the count of elements added is
	// same as value of 'N'
	@Test
	public void calculateAverageListCountEqualsNTest() {
		movingAverageImpl.addElement(1d);
		movingAverageImpl.addElement(2d);
		movingAverageImpl.addElement(3d);
		assertEquals(2.0, movingAverageImpl.calculateMovingAverage());
	}

	// Test to check the moving average is correct if the count of elements added is
	// more than the value of 'N'
	@Test
	public void calculateAverageListCountMoreThanNTest() {
		movingAverageImpl.addElement(1d);
		movingAverageImpl.addElement(2d);
		movingAverageImpl.addElement(3d);
		movingAverageImpl.addElement(4d);
		assertEquals(3.0, movingAverageImpl.calculateMovingAverage());
	}

	// Test to check the moving average is correct if the count of elements added is
	// less than the value of 'N'
	@Test
	public void calculateAverageListCountLessThanNTest() {
		movingAverageImpl.addElement(1d);
		movingAverageImpl.addElement(2d);
		assertEquals(null, movingAverageImpl.calculateMovingAverage());
	}

	// Test to check the moving average is null if no element has been added
	@Test
	public void calculateAverageListCountEqualToNullTest() {
		assertEquals(null, movingAverageImpl.calculateMovingAverage());
	}

	// Test to check that the same elements that were added can be retrieved also
	@Test
	public void getElementValidIndexTest() {
		movingAverageImpl.addElement(1d);
		movingAverageImpl.addElement(2d);
		movingAverageImpl.addElement(3d);
		assertEquals(1.0, movingAverageImpl.getElements().get(0));
		assertEquals(2.0, movingAverageImpl.getElements().get(1));
		assertEquals(3.0, movingAverageImpl.getElements().get(2));
	}

}
