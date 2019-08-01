package com.hsbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class ResultSetDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527//hsbcdb");
		String sql = "select * from employee where dept=?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, "hr");
		ResultSet rs = st.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("no. of columns "+rsmd.getColumnCount());
		for(int i=1;i<=rsmd.getColumnCount();++i) {
			System.out.println("Column name "+rsmd.getColumnName(i));
			System.out.println("Column type "+rsmd.getColumnTypeName(i));
			System.out.println("Scale "+rsmd.getScale(i));
			System.out.println("precision"+rsmd.getPrecision(i));
			System.out.println("------------------------------------");
		}
		conn.close();
	}

}
