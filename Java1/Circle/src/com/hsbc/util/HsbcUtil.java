package com.hsbc.util;

public class HsbcUtil {
	public static final int HUNDRED=100;
	public static final int TWO=2;
	
	public static boolean validateDataGreaterThanZero(double data,String label) throws Exception
	{
		if(data<=0)
			throw new Exception(label+" must be greater than zero");
		return true;
	}
}
