package com.hsbc.demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class InsertEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527//hsbcdb");
		String sql = "Insert into employee values(?,?,?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, 1010);
		st.setString(2, "keshav");
		st.setDouble(3, 33000);
		st.setString(4, "pr");
		LocalDate ldt = LocalDate.of(2018, 04, 07);
		st.setDate(5, Date.valueOf(ldt));
		int rows = st.executeUpdate();
		conn.close();
		System.out.println(rows + " row added ");


 }
}
