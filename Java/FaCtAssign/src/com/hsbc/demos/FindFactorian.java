package com.hsbc.demos;

import java.math.BigInteger;

public class FindFactorian extends Factorial{
		public boolean findFactorian(int num) {
			int quot = num ;
			int rem =0 ;
			BigInteger sum = BigInteger.ZERO;
			while(quot>0) {
				rem = quot%10 ;
				quot = quot/10 ;
				sum.add(findFactorial(rem));
			}
			if(sum.equals(BigInteger.valueOf(num)))
				return true;
			return false ;
		}
}
