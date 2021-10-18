package com.vamsi.mockito.service;

import com.vamsi.mockito.dao.DataDao;

public class DataServiceImpl implements DataService {
	
	DataDao dataDao;

	public DataServiceImpl(DataDao dataDao) {
		super();
		this.dataDao = dataDao;
	}

	@Override
	public int findSum() {
		int sum = 0;
		for(int i : dataDao.retrieveAllData()) {
			sum += i;
		}
		
		return sum;
	}
	
	

}
