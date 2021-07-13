package com.mph.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.mph.Calculate;
import com.mph.User;

public class UserTest {
	
	User user;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before called");
		user = new User();
	}
	
	
	
	@Rule
    public ExpectedException exception = ExpectedException.none();
	/*
	 * @Test public void testUserNameTooShort() { user.setName("joshna");
	 * assertTrue(user.name.length()< 3);
	 * exception.expect(IllegalArgumentException.class);
	 * exception.expectMessage("User Name Tooooooooooooooooooooooo Short !!!");
	 * 
	 * }
	 */
	
	@Test
	public void testUserNameTooLong() {	
		Throwable exception  = assertThrows(IllegalArgumentException.class, ()->{
			
			user.setName("Sayantan Afeed  Varun Vamshi Sasi Pradeep Prasana@@@@");
			//user.setName("Araun");
		});		
	
	}
	
	@Test(expected = NullPointerException.class)
	public void testUserNameIsnull() {	
		
			user.setName(null);
	}
	@After
	public void tearDown() throws Exception {		
		user = null;
		System.out.println("@After called");
	}

}
