package com.hsbc.service;
import com.hsbc.util.HsbcUtil;
public class circle {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) throws Exception {
		HsbcUtil.validateDataGreaterThanZero(radius,"radius");
	    this.radius = radius;
	}
	public double calcArea(int radius)
	{
		return Math.PI*radius*radius;
		
	}
	public double calcPerimeter(int radius)
	{
		return HsbcUtil.TWO *Math.PI*radius;
		}

}
