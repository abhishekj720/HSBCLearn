package com.hsbc.client;

import com.hsbc.service.Mtable;

public class MtableClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Mtable tbl = new Mtable(5);
			tbl.display();
				
		} 
		catch(Exception e) {
			System.out.println("Noooooooooooo");
		}
		
	}

}
