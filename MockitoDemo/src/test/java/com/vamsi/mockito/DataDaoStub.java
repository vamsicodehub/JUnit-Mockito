package com.vamsi.mockito;

import com.vamsi.mockito.dao.DataDao;

public class DataDaoStub implements DataDao {

	@Override
	public int[] retrieveAllData() {
		
		return new int[] {1,2,3};
	}

}
