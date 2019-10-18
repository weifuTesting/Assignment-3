package com.IT7320.A3_partB;
	

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SubtractionTest {
	private Arithmitic testObj;
	private int a, b, expected, actual;

	@Before
	public void setUp() throws Exception {
		a = 45;
		b = 37;
		testObj = new Arithmitic(a,b);
		expected = a-b;
		actual = testObj.subtract(a, b);
	}
	
	@Test
	public void testSubtract() {
		assertEquals(expected,actual);
	}

	@After
	public void tearDown() throws Exception {
		testObj = null;
	}


}
