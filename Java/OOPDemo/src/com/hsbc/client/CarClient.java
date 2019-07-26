package com.hsbc.client;
import com.hsbc.service.Car;

public class CarClient {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class.forName("com.hsbc.service.Car");
		Class cls = Class.forName("com.hsbc.service.Car");
		Car car = (Car)cls.newInstance();
		car.drive();

	}

}
