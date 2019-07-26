package com.hsbc.client;

import java.util.Scanner;

import com.hsbc.dao.IEmpDao;

enum Menu {
	ADD,VIEWBYID,VIEWBYDEPT,EDIT,REMOVE,VIEWALL
}

public class EmpClient {
	public static Scanner scan = new Scanner(System.in);
	private static EmpUI ui = new EmpUI();
	public static void main(String[] args) {
		String opt = null;
		do {
			processMenu();
			System.out.println("press y to continue");
			opt = scan.next();
			
		}while(opt.equals("y"));
	}
	
	public static void processMenu() {
		int eid=0;
		System.out.println("Enter the menu option");
		System.out.println("ADD\nVIEWBYID\nVIEWBYDEPT\nEDIT\nREMOVE\nVIEWALL\n");
		String str = scan.next();
		try {
		Menu menu = Menu.valueOf(str.toUpperCase()); //converts atring to enum constants
		switch(menu) {
		case ADD:	ui.addEmployee();
					break;
		case VIEWALL: 	ui.viewAll();
						break;
						
		case VIEWBYID: 
			System.out.println("Enter ID");
			eid = scan.nextInt();
			ui.viewbyID(eid);	break ;
		case VIEWBYDEPT: 
			ui.viewDept("hr");
			break;
		case REMOVE: 
			System.out.println("Enter ID");
			eid = scan.nextInt();
			ui.remove(eid);break;
		
		}
		}catch(Exception e) {
			System.out.println(e.getMessage()+"Invalid menu option");
		}
		}
	}



