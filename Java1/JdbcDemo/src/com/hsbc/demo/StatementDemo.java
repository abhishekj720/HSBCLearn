package com.hsbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class StatementDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527//hsbcdb");
		String dname="pr";
		String sql = "select * from employee where dept='"+dname+"'";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getDouble("al"));
			System.out.println(rs.getString("dept"));
			System.out.println(rs.getDate("doj"));
			System.out.println("---------------------------");
		}
		conn.close();
	}

}
