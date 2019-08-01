package com.hsbc.dao;

public class JdbcDao implements IDao {

	JdbcDao()
	{
		
	}
	@Override
	public String getDaoName() {
		
		return "JDBC";
	}
	
	

}
