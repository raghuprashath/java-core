package com.learning.core.day10;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class CalculatorTest {
	@Test
	public void testAdd()
	{
		assertEquals(100,D10P07.add(70, 30));
	}
	@Test
	public void testSub()
	{
		assertEquals(10,D10P07.sub(30, 20));
	}
	@Test
	public void testMul()
	{
		assertEquals(0,D10P08.mul(15, 0));
	}
	@Test
	public void testDiv()
	{
		assertEquals(10,D10P08.div(100, 10));
	}
	@Test
	public void testDivcatch()
	{
		assertEquals(-1,D10P08.div(1, 0));
	}
	@Test
	public void testFindMax()
	{
		int arr[]= {1,2,3,4,5,6};
		int arr1[]= {-1,-2,-3,-4,-5,-6};
		assertEquals(6,D10P09.findMax(arr));
		assertEquals(-1,D10P09.findMax(arr1));
	}

}