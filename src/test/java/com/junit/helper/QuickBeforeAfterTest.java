package com.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@BeforeClass
	public static void beforeClassDemo() {
		System.out.println("before Class");
	}
	
	@AfterClass
	public static void afterClassDemo() {
		System.out.println("after Class");
	}

	
	@Before 
	public void setup() {
		System.out.println("before Test");
	}

	@Test
	public void test1() {
		System.out.println("test 1 exeucted");
		
	}

	@Test
	public void test2() {
		System.out.println("test 2 exeucted");
		
	}
	
	@After 
	public void tearDown() {
		System.out.println("after Test");
	}

}
