package com.hsbc.client;

import com.hsbc.service.Mtable;

public class MtableClien {

	public static void main(String[] args) {
		try {
			Mtable tbl = new Mtable(5);
			tbl.display(7);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		

	}

}
