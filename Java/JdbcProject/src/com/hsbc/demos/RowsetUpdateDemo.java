package com.hsbc.demos;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowsetUpdateDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:derby://localhost:1527/hsbcdb");
		rowSet.setCommand("select * from employee");
		rowSet.execute();
		rowSet.addRowSetListener(new MyListener()); // TODO Auto-generated method stub
		rowSet.absolute(2);

		rowSet.updateString(2, "peter arnold");

		rowSet.updateRow();

		System.out.println("row updated...");
		rowSet.close();

	}

}
