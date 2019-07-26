package com.hsbc.circle;

import com.hsbc.util.HsbcUtil;

public class Circle {
	
	public int r;

	public int getR() {
		return r;
	}

	public void setR(int r2) throws Exception {
		if(r2 < 0.0)
		{
			throw new Exception("radius must be greater than 0");
		}
		HsbcUtil.ValidateGreaterThanZero(r2, "radius");
		this.r = r2;
	}
public static double calcPerm(float r) {
		
		return 2*Math.PI*r;
		
	}
	
	public static double Area(float r) {
		
		return Math.PI*r*r;
	
	}
	
}
