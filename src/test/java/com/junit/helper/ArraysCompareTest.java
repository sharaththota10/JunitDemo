package com.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort() {
		int[] numbers = {12,3,4,1,2};
		int[] expected = {1,2,3,4,12};
		Arrays.sort(numbers);
		//assertEquals(expected,numbers);
		assertArrayEquals(expected,numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		//try{
		Arrays.sort(numbers);
//		}
//		catch(NullPointerException e) {
//			
//		}
	}
	
	@Test(timeout=100)
	public void testSort_Performance() {
		int[] numbers = {12,3,4,1,2};
		for(int i=1;i<1000000;i++) {
			numbers[0] = i;
		Arrays.sort(numbers);
		}
	}

}
