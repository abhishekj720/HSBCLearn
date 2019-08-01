package com.hsbc.demos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class InsertEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/hsbcdb");
		String sql = "INSERT INTO employee VALUES(?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, 1007);
		st.setString(2,"akash");
		st.setDouble(3, 33000);
		st.setString(4, "pr");
		LocalDate ldt = LocalDate.of(2018, 04, 7);
		st.setDate(5,Date.valueOf(ldt));
		int rows = st.executeUpdate();
		con.close();
		System.out.println("Rows created");
	}

}
