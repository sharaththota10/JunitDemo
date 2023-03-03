package com.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	//StringHelper helper = new StringHelper();
	StringHelper helper;
	
	@Before
	public void before() {
		helper = new StringHelper();
	}
	
	
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		
		//assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		assertFalse("Dummy STring",helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	@Test
	public void testTruncateAInFirst2Positions2_otherTest() {
		
		//assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		assertTrue("Dummy STring",helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}

}
