package com.rits.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rits.SomeBusinessImpl;

public class SomeBusinessStubTest {

	@Test
	public void testFindTheGreatestFromAllData(){
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(24,result);
	}
}
