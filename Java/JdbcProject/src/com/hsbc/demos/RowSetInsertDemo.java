package com.hsbc.demos;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetInsertDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:derby://localhost:1527/hsbcdb");
		rowSet.setCommand("select * from employee");
		rowSet.execute();
		rowSet.addRowSetListener(new MyListener()); // TODO Auto-generated method stub
        rowSet.moveToInsertRow();
        rowSet.updateInt(1, 1008);
        rowSet.updateString(2, "vinay");
        rowSet.updateDouble(3, 38000);
        rowSet.updateString(4, "hr");
		LocalDate ldt = LocalDate.of(2018, 04, 7);
		 rowSet.updateDate(5,Date.valueOf(ldt));
		 rowSet.insertRow();
		 
		 System.out.println("row inserted...");
        rowSet.close();
	}

}
