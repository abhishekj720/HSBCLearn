package com.hsbc.service;

public interface IShape {//rewritten by compiler as abstract

	//int max=10;//by default public static final
	double calcVolume();//compiler rewrites it as public abstract
	void acceptData();
}
