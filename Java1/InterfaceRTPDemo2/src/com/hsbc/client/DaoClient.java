package com.hsbc.client;

import com.hsbc.dao.DaoFactory;
import com.hsbc.dao.IDao;
import com.hsbc.dao.JdbcDao;

public class DaoClient {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		IDao dao = DaoFactory.getDaoInstance();
		System.out.println(dao.getDaoName());

	}

}
