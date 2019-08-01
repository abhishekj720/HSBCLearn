package com.hsbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AggDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527//hsbcdb");
		String sql = "select avg(al) avgsal,max(al) maxsal from employee";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs=st.executeQuery();
		if(rs.next()) {
			System.out.println("Average = "+rs.getDouble("avgsal"));
			System.out.println("Maximum = "+rs.getDouble("maxsal"));
		}

	}

}
