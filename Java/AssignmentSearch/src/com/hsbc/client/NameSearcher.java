package com.hsbc.client;

import com.hsbc.service.NewBinSearch;

public class NameSearcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"1","4","2","5","9","3","0"};
		
		NewBinSearch ns = new NewBinSearch(arr);
		
		System.out.print("string present using binary ="+ns.search(arr,"2")+"\n");
		System.out.print("string present using linear ="+ns.search2(arr,"2"));
		ns.display("DESV");
		ns.display2(arr);
		
	}

}
