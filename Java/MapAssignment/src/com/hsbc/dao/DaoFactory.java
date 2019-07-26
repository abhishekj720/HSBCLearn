package com.hsbc.dao;

import java.util.ResourceBundle;

public class DaoFactory {
	
	public static IEmpDao getDao()  {
		IEmpDao dao = null;
		ResourceBundle.clearCache();
		ResourceBundle rb = ResourceBundle.getBundle("hsbc"); //loads hsbc.properties file
		String clsname = rb.getString("cname");
		try {
			Class cls = Class.forName(clsname);
			dao = (IEmpDao)cls.getMethod("getDaoInstance",null).invoke(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //load the class progrmatically
		return dao;
	}
	
}
