package com.vamsi.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.vamsi.mockito.dao.DataDao;
import com.vamsi.mockito.service.DataServiceImpl;

public class MockitoDemoApplicationTestsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

//	@Test
	public void test() {
//		fail("Not yet implemented");
		/*
		  The below stud implementation has disadvantages like when ever that
		  particular stub implemented service chnages need to change the stub. So to
		  avoid this kind of headaches just use Mockito Fw
		 */
		DataServiceImpl dataServiceImpl = new DataServiceImpl(new DataDaoStub());
		assertEquals(6, dataServiceImpl.findSum());
	}
	
	@Test
	public void testWithMockito() {
		DataDao dataDao = mock(DataDao.class);
		when(dataDao.retrieveAllData()).thenReturn(new int[] {1,2,3});
		System.out.println(Arrays.toString(dataDao.retrieveAllData()));
		DataServiceImpl dataServiceImpl = new DataServiceImpl(dataDao);
		assertEquals(6, dataServiceImpl.findSum());
	}
	
	

}
