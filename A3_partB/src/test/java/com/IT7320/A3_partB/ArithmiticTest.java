package com.IT7320.A3_partB;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArithmiticTest {
	private Arithmitic testObj;
	private int a, b, expected, actual, expected2, actual2;

	@Before
	public void setUp() throws Exception {
		a = 45;
		b = 37;
		testObj = new Arithmitic(a,b);
		expected = a+b;
		actual = testObj.add(a, b);
		expected2 = a-b;
		actual2 = testObj.subtract(a, b);
	}
	
	@Test
	public void testAdd() {
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		assertEquals(expected2, actual2);
	}

	@After
	public void tearDown() throws Exception {
		testObj = null;
	}

}
