package com.hsbc.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.hsbc.dao.DaoFactory;
import com.hsbc.dao.IEmpDao;
import com.hsbc.entity.Emp;
import com.hsbc.exceptions.IDException;

public class EmpUI {

	private IEmpDao dao = DaoFactory.getDao();
	private static Scanner scan = EmpClient.scan;

	public void viewAll() {
		List<Emp> lst = dao.viewEmployee();
		lst.forEach(System.out::println);
	}

	public void addEmployee() {
		System.out.println("enter the emp id");
		int eid = scan.nextInt();
		System.out.println("enter employee name");
		String name = scan.next();
		System.out.println("enter sal");
		double sal = scan.nextDouble();
		System.out.println("enter dept");
		String dept = scan.next();
		System.out.println("enter date of joining");
		String strtdt = scan.next();

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate doj = LocalDate.parse(strtdt, df);
		Emp emp = new Emp(eid, name, sal,dept,doj);
		try {
			dao.addEmployee(emp);
			System.out.println("employee added");
		}catch(IDException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void viewByDept() {
		System.out.println("enter the dept");
		String dept = scan.next();
		List<Emp> lst = dao.viewEmployee(dept);
		if(lst.isEmpty()) System.out.println("no employee found!");
		else lst.forEach(System.out::println);
	}
	
	public void viewByID() {
		System.out.println("enter the Emp Id");
		int id = scan.nextInt();
		List<Emp> lst;
		try {
			lst = (List<Emp>) dao.viewEmployee(id);
			if(lst.isEmpty()) System.out.println("no employee found!");
			else lst.forEach(System.out::println);
		} catch (IDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void edit() {
		
	}
	
	public void remove() {
		System.out.println("enter empId");
		int id = scan.nextInt();
			try {
				dao.removeEmployee(id);
				System.out.println("employee removed");
			} catch (IDException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
