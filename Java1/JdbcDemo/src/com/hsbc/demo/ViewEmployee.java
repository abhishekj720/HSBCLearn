package com.hsbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ViewEmployee {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527//hsbcdb");
		String sql = "select * from employee where al between ? and ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, "25000");
		st.setString(2, "35000");
		ResultSet rs = st.executeQuery();
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
