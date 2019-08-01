package com.hsbc.client;

import com.hsbc.service.NewNameSearcher;

public class SearchClient {

	public static void main(String[] args) {
		NewNameSearcher obj=new NewNameSearcher();
		obj.display();
		System.out.println("\n");
		System.out.println(obj.search("hc"));
		System.out.println("\n");
		obj.display("des");

	}

}
