package com.hsbc.client;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

enum Menu {
	ADD, VIEWBYID, VIEWBYDEPT, EDIT, REMOVE, VIEWALL
}

public class EmpClient {

	public static Scanner scan = new Scanner(System.in);

	private static EmpUI ui = new EmpUI();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opt = null;
		do {
			processMenu();
			System.out.println("press y to continue");
			opt = scan.next();
		} while (opt.equals("y"));
	}

	public static void processMenu() {
		System.out.println("enter option");
		System.out.println("ADD\nVIEWBYID\nVIEWBYDEPT\nVIEWALL\nEDIT\nREMOVE");
		String str = scan.next();
		try {
			Menu menu = Menu.valueOf(str.toUpperCase());
			switch (menu) {
			case ADD:
				ui.addEmployee();
				break;
			case VIEWBYID:
				ui.viewByID();
				break;
			case VIEWBYDEPT:
			ui.viewByDept();
				break;
			case VIEWALL:
				ui.viewAll();
				break;
			case EDIT:
				
				break;
			case REMOVE:
				ui.remove();
				break;
				
			}
		}catch(Exception e) {
			System.out.println(e.getMessage()+"Invalid option");
		}
		
	}

}
