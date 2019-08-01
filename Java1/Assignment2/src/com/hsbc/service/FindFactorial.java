package com.hsbc.service;

import java.math.BigInteger;

public class FindFactorial {

	public BigInteger findFactorial(int num)
	{
		BigInteger fact=BigInteger.ONE;
		for(int i=1;i<num;i++)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
			}
	return fact;
}
}
