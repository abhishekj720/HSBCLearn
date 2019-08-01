package com.hsbc.demos;

import java.sql.SQLException;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:derby://localhost:1527/hsbcdb");

		rowSet.setCommand("select * from employee");
		rowSet.execute();
		rowSet.addRowSetListener(new MyListener());  
		while (rowSet.next()) {
			// Generating cursor Moved event
			System.out.println("Id: " + rowSet.getInt("eid"));
			System.out.println("Name: " + rowSet.getString("ename"));
			System.out.println("Salary: " + rowSet.getString("sal"));
			System.out.println("---------------------------------------------------------------");
		}
	}

}

class MyListener implements RowSetListener {
	public void cursorMoved(RowSetEvent event) {
		System.out.println("Cursor Moved...");
	}

	public void rowChanged(RowSetEvent event) {
		System.out.println("Cursor Changed...");
	}

	public void rowSetChanged(RowSetEvent event) {
		System.out.println("RowSet changed...");
	}
}
