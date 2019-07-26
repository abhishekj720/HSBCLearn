package com.hsbc.client;

import com.hsbc.daop.DaoFactory;
import com.hsbc.daop.IDao;
import com.hsbc.daop.JdbcDao;

public class DaoClient {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		IDao dao = DaoFactory.getDaoInstance();
		System.out.println(dao.getDaoName());

	}

}
