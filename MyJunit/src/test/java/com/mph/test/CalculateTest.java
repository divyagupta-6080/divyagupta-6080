package com.mph.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.mph.Calculate;

public class CalculateTest {
	Calculate calc;
	
	@BeforeClass
	public static  void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass called");
		
	}
	
	
	
	
	@Rule
	public ExpectedException ex = ExpectedException.none();
	
	
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before called");
		calc = new Calculate();
	}
	
	/*@Test
	public void testAdd1() {
		System.out.println("From Add test ");
		assertEquals(24, calc.add(12,12));
		
	}
	@Test
	public void testAdd2() {
		System.out.println("From Add test ");
		
		assertEquals(23, calc.add(13,10));
	}
	*/
	@Test(expected = InterruptedException.class, timeout = 2500)
	public void testMultiply() {
		System.out.println("From Multiply test ");
		//ex.expect(InterruptedException.class);
		ex.expectMessage("Thread Intrupption Occursssssss");
		assertEquals(40, calc.multiply(2,5,4));
		System.out.println("TimeOut");
	}
	@After
	public void tearDown() throws Exception {		
		calc = null;
		System.out.println("@After called");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {		
		
		System.out.println("@AfterClass called");
	}
}
