package com.rits.test;

import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class ListTest {

	@Test
	public void test(){
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
	}
	@Test
	public void test_multiple(){
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
		
		when(listMock.get(0)).thenReturn("SomeThing");
		assertEquals("SomeThing", listMock.get(0));
	}
}
