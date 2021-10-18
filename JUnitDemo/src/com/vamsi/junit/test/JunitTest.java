package com.vamsi.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vamsi.junit.src.JunitSrc;

import junit.framework.TestResult;

class JunitTest {

	JunitSrc src = new JunitSrc();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@BeforeEach
//	@Before
	public void before() throws Exception {
		System.out.println("setUp");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	void testLargeNumber() {
//		fail("Not yet implemented");
		TestResult testResult = new TestResult();
		System.out.println(testResult.errorCount());
		int result = src.largeNumber(new int[]{1,2,3});
		System.out.println(result);
		assertNotEquals(3, result);
	}

}
