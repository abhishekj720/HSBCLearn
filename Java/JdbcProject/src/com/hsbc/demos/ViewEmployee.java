package com.hsbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/hsbcdb");
		String sql = "select * from employee where dept = ?";
		String sql2 = "select * from employee where sal between ? and ?";
		PreparedStatement st = con.prepareStatement(sql2);
		st.setString(1, "25000");
		st.setString(2, "70000");
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getDouble("sal"));
			System.out.println(rs.getString("dept"));
			System.out.println(rs.getDate("doj"));
			System.out.println("-------------------------------------------------------");
		}
		con.close();
	}

}
