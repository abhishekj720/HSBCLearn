package com.hsbc.client;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.hsbc.dao.DaoFactory;
import com.hsbc.dao.IEmpDao;
import com.hsbc.entity.Emp;
import com.hsbc.exceptions.IDException;

public class EmpUI {

	private IEmpDao dao = DaoFactory.getDao();
	private static Scanner scan = new Scanner(System.in);
	
	public void viewAll() {
		List<Emp> lst = dao.viewEmployee();
		lst.forEach(System.out::println);
	}
	
	public void viewbyID(int eid) {
		List<Emp> lst = dao.viewEmployee();
		if(lst.contains(eid)) {
			System.out.println(lst.get(eid));;
		}
	}
	public void viewbyID(int eid){
		List<Emp> lst = dao.viewEmployee();
		List<Emp> lst2 = lst.stream().filter(e->e.geteid().equals(dept)).collect(Collectors.toList());
		 System.out.println(lst2);
	}
//	
//	public void remove(int eid) throws IDException {
//		dao.removeEmployee(eid);
//	}
	
	
	
	public void remove(int eid) throws IDException {
		List<Emp> lst = dao.viewEmployee();
		if(!lst.contains(eid))
			throw new IDException("ID not found");
		System.out.println(((IEmpDao) lst).viewEmployee());
		
	}
	
	public void viewDept(String dept){
		List<Emp> lst = dao.viewEmployee();
		List<Emp> lst2 = lst.stream().filter(e->e.getDept().equals(dept)).collect(Collectors.toList());
		 System.out.println(lst2);
	}
	
	public void addEmployee() {
		
		System.out.println("Enter the employee ID");
		int eid = scan.nextInt();
		System.out.println("Enter the empl name");
		String name = scan.next();
		System.out.println("Enter the salary");
		double sal = scan.nextDouble();
		System.out.println("Enter the dept");
		String dept = scan.next();
		System.out.println("Enter the date of joining");
		String strdt = scan.next();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("d-M-yyyy");
		LocalDate obj = LocalDate.parse(strdt,df);
		Emp emp = new Emp(eid,name,sal,obj,dept);
		try {
			dao.addEmployee(emp);
			System.out.println("Employee added");
			
		}catch(IDException e) {
			System.out.println(e.getMessage());
		}
		
	}
}