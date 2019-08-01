package com.hsbc.dao;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class DaoFactory {

	private static ResourceBundle rb = ResourceBundle.getBundle("hsbc");
	public static final String DBURL;
	public static final String DRIVER;
	
	static {
		DBURL = rb.getString("dburl");
		DRIVER = rb.getString("driver");
	}
	public static IEmpDao getDao() {
		IEmpDao dao=null;
		ResourceBundle.clearCache();
		//ResourceBundle rb=ResourceBundle.getBundle("hsbc");//loads hsbc properties file
		String clsname=rb.getString("cname");
		try {
			Class cls = Class.forName(clsname);//load the class programatically
			dao=(IEmpDao)cls.getMethod("getDaoInstance",null).invoke(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dao;
	}

}
