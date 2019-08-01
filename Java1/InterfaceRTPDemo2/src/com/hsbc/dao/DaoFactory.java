package com.hsbc.dao;

import java.util.ResourceBundle;

public class DaoFactory {

	public static IDao getDaoInstance() throws InstantiationException, IllegalAccessException
	{
		IDao dao=null;
		ResourceBundle rb=ResourceBundle.getBundle("hsbc");//loads hsbc properties file
		String clsname=rb.getString("cname");
		try {
			Class cls = Class.forName(clsname);//load the class programatically
			dao=(IDao)cls.newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return dao;
	}
}
