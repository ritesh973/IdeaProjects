package com.rits.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.rits.DataService;
import com.rits.SomeBusinessImpl;
@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotation {
	@Mock
	DataService dataService;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;
	
	@Test
	public void testFindTheGreatestFromAllData(){
		when(dataService.retrieveAllData()).thenReturn(new int[]{24,15,3});
		int result = someBusinessImpl.findGreatestFromAllData();
		assertEquals(24,result);
	}
	
	@Test
	public void testFindTheGreatestFrom_AllData(){
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24,15,3});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(24,result);
	}
}
