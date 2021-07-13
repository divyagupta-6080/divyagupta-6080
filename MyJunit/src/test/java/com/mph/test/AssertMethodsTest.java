package com.mph.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertMethodsTest {
	
	@Test
	public void testAssertions() {
		String str1 = new String("deeps");
		String str2 = new String("deeps");
		String str3 = null;
		String str4 = "deeps";
		String str5 = "deeps";
		
		int val1 =5;
		int val2 =6;		
		
		String[] arr1 = {"one","two","three"};
		String[] arr2 = {"one","two","three"};
		assertEquals(str1, str2);
		
		assertTrue(val1 < val2);		
		assertFalse(val1 > val2);		
		assertNull(str3);		
		assertSame(str4, str5);		
		assertNotSame(str1, str2);		
		assertArrayEquals(arr1, arr2);
		
		
	}

}
