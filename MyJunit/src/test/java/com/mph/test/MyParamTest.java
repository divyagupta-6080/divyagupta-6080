package com.mph.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.mph.Calculate;

@RunWith(Parameterized.class)
public class MyParamTest {
	private int x;
	private int y;
	private int result;
	
	Calculate calc;


	public MyParamTest(int x, int y, int result) {
		super();
		this.x = x;
		this.y = y;
		this.result = result;
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before called");
		calc = new Calculate();
	}
	
	@Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object[][] {{10,20,30},{10,10,20},{40,40,80},{111,111,222},{55,10,65}});
	}
	
	@Test
	public void testSum() {
		System.out.println(" Sum : " + result);
		assertEquals(result, calc.sum(x,y));
	}
	
	
}
