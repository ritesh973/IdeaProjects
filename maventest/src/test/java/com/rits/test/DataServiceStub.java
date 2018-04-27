package com.rits.test;

import com.rits.DataService;

public class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[]{24,6,15};
	}

}
