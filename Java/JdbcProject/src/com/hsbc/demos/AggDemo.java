package com.hsbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AggDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/hsbcdb");
		String sql = "select avg(sal) avgsal , max(sal) maxval from employee";
		PreparedStatement st = con.prepareStatement(sql);
//		st.setString(1,"hr");
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			System.out.println("Average"+ rs.getDouble("avgsal"));
			System.out.println("Max Salary"+ rs.getDouble("maxval"));
		}
		con.close();
	}

}
