package com.scmoon.test003;

// import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ForTestTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test 
	public void test001() {
		
		ForTest test = new ForTest();
		
		assert( 1 == test.test001() ) ; 
	
	}

	@Test 
	public void test002() {
		
		ForTest test = new ForTest();
		
		assert( 2 == test.test002() ) ; 
	
	}


}
