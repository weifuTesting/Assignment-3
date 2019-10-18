package com.IT7320.A3_PartA;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TaxImplementationTest {
	TaxImplementation implementationObj;
	double a;
	double expected,actual;
	ITax mockObj;
	Employee employee;
	Employee employee2;
	Employee employee3;
	double expectedWeek,actualWeek;
	double expectedfortnight,actualfortnight;
	double expectedkiwiSaver,actualKiwiSaver;


	@Before
	public void setUp() throws Exception {
		
		TaxImplementation implementationObj = new TaxImplementation();
		a = 20000;
		expected = a * 0.33;		
		mockObj = Mockito.mock(ITax.class);
		Mockito.when(mockObj.computeTax(a)).thenReturn(a*0.33);
		implementationObj.setObj(mockObj);		
		actual = implementationObj.computeTax(a);
		
		Employee employee = new Employee(200);
		expectedWeek = 200 * 7;
		Mockito.when(mockObj.weeklySalary(employee)).thenReturn(employee.dailySalary*7);	
		actualWeek = implementationObj.weeklySalary(employee);
		
		Employee employee2 = new Employee(200);
		expectedfortnight = 200 * 14;
		Mockito.when(mockObj.fortnightSalary(employee2)).thenReturn(employee.dailySalary*14);	
		actualfortnight = implementationObj.fortnightSalary(employee);
		
		Employee employee3 = new Employee(200);
		expectedkiwiSaver = 200 + 200 * 0.054;
		Mockito.when(mockObj.computeKiwiSaver(employee2)).thenReturn(employee.dailySalary+ employee.dailySalary * 0.054);	
		actualKiwiSaver = implementationObj.computeKiwiSaver(employee);
		
		
		
	}	
	@Test
	public void  testComputeTax() {
		
		
		assertEquals(expected,actual,0.0001);	
	}
	
	@Test
	public void  weeklySalary() {		
		
		assertEquals(expectedWeek,actualWeek,0.0001);	
	}
	
	@Test
	public void  fortnightSalary() {
		
		
		assertEquals(expectedWeek,actualWeek,0.0001);	
	}
	
	@Test
	public void  computeKiwiSaver() {
		
		
		assertEquals(expectedWeek,actualWeek,0.0001);	
	}
	
	
	
	
	@After
	public void tearDown() throws Exception {
		mockObj = null;
		implementationObj = null;
		employee = null;
		employee2 = null;
		employee3 = null;
	}
	


}
