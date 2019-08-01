package com.hsbc.client;

import com.hsbc.service.Car;

public class CarClient {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Class cls=Class.forName("com.hsbc.service.Car");//loads the class programatically
		Car car = (Car)cls.newInstance();//creating new instance
		car.drive();
	}

}
