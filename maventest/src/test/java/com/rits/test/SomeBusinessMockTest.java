package com.rits.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.rits.DataService;
import com.rits.SomeBusinessImpl;

public class SomeBusinessMockTest {
	@Test
	public void testFindTheGreatestFromAllData(){
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24,15,3});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(24,result);
	}
}
