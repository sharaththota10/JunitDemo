package com.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper=new StringHelper();
	
	String input;
	String  expectedOutput;
	
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testConditions()
	{
		String expectedOutputs[][]= {{"AACD","CD"},{"ACD","CD"}};
		
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
	}
	
//	@Test
//	public void testTruncateAInFirst2Positions2() {
//		
//		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
//		}

}
