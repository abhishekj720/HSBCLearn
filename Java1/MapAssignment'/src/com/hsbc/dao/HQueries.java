package com.hsbc.dao;

public interface HQueries {

	String addQuery = "insert into employee values (?,?,?,?,?) ";
	String viewall = "select * from employee";
	String viewById = "select * from employee where eid=?";
	String viewByDept = "select * from employee where dept = ?";
	String removeQry = "delete from employee where eid= ?";
	String editQry = "update employee set al=? where eid=?";
}
