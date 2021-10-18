package com.vamsi.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.vamsi.mockito.dao.DataDao;
import com.vamsi.mockito.service.DataServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class MockitoDemoApplicationAnnotationTest {
	
	@Mock
	DataDao dataDao;
	
	@InjectMocks
	DataServiceImpl dataServiceImpl;

	@Test
	public void testWithMockito() {
		when(dataDao.retrieveAllData()).thenReturn(new int[] {1,2,3});
		System.out.println(Arrays.toString(dataDao.retrieveAllData()));
		assertEquals(6, dataServiceImpl.findSum());
	}
	
	

}
