package com.hsbc.daop;

import java.util.ResourceBundle;

public class DaoFactory {
	
	public static IDao getDaoInstance() throws InstantiationException, IllegalAccessException {
		IDao dao = null;
		ResourceBundle rb = ResourceBundle.getBundle("hsbc"); //loads hsbc.properties file
		String clsname = rb.getString("cname");
		try {
			Class cls = Class.forName(clsname);
			dao = (IDao)cls.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //load the class progrmatically
		return dao;
	}
	
}
