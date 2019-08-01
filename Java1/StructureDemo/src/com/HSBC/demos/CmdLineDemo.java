package com.HSBC.demos;

public class CmdLineDemo {

	public static void main(String[] args) {
		System.out.println("length of args array"+args.length);
		int val1 = Integer.parseInt(args[0]);
		int val2 = Integer.parseInt(args[1]);
		int val3=val1+val2;
		System.out.println(val3);

	}

}
