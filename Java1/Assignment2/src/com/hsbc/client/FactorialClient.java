package com.hsbc.client;

import com.hsbc.service.FindFactorian;

public class FactorialClient {

	public static void main(String[] args) {
		FindFactorian obj=new FindFactorian();
		System.out.println(obj.findFactorial(5));
		System.out.println(obj.findFactorian(145));

	}

}
