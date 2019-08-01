package com.hsbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetadata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/hsbcdb");
		String sql = "select * from employee where dept = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,"HR");
		ResultSet rs = st.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("no of columsn"+rsmd.getColumnCount());
		for(int i=1;i<=rsmd.getColumnCount();++i) {
			System.out.println("Column Name:"+ rsmd.getColumnLabel(i));
			System.out.println("Column Type:"+ rsmd.getColumnTypeName(i));
			System.out.println("Scale:"+ rsmd.getScale(i));
			System.out.println("Precission"+ rsmd.getPrecision(i));
			
			
		}
		con.close();
	}

}
