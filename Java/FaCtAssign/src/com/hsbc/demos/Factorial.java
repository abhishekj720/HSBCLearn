package com.hsbc.demos;

import java.math.BigInteger ;

public class Factorial {

		public BigInteger findFactorial(int num) {
			BigInteger fact = BigInteger.ONE;
			for(int idx=1;idx<=num;idx++) {
				fact.multiply(BigInteger.valueOf(idx));
			}
			return fact;
		}
}
