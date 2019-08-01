package com.hsbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.derby.client.am.SqlException;

import com.hsbc.entity.Emp;
import com.hsbc.exceptions.IDException;

public class EmpJdbcDaoImpl implements IEmpDao {
	
	private static IEmpDao dao =  new EmpJdbcDaoImpl();
	static {
		try {
			Class.forName(DaoFactory.DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	private EmpJdbcDaoImpl() {
		
	}
	public static IEmpDao getDaoInstance() {
		return dao;
		
	}
	@Override
	public boolean addEmployee(Emp emp) throws IDException {
		try(Connection conn = DriverManager.getConnection(DaoFactory.DBURL)){
			PreparedStatement st=conn.prepareStatement(HQueries.addQuery);
			st.setInt(1, emp.getEmpId());
			st.setString(2, emp.getEmpName());
			st.setDouble(3, emp.getEmpSal());
			st.setString(4, emp.getDept());
			st.setDate(5, Date.valueOf(emp.getDoj()));
			return true;
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return false;
	}
	@Override
	public Emp viewEmployee(int eid) throws IDException {
		Emp emp =null;
		List<Emp> lst=new ArrayList<Emp>();
		try(Connection conn = DriverManager.getConnection(DaoFactory.DBURL)){
			PreparedStatement st=conn.prepareStatement(HQueries.viewById);
			st.setLong(1,eid);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				emp = new Emp(rs.getInt("eid"),rs.getString("ename"),rs.getDouble("al"),rs.getString("dept"),rs.getDate("doj").toLocalDate());
			}
		}catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		return emp;
	
	}
	@Override
	public List<Emp> viewEmployee() {
		List<Emp> lst=new ArrayList<Emp>();
		try(Connection conn = DriverManager.getConnection(DaoFactory.DBURL)){
			PreparedStatement st=conn.prepareStatement(HQueries.viewall);
			ResultSet rs = st.executeQuery();
			lst=bindData(rs,lst);
			return lst;
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return lst;
	}
	public List<Emp> bindData(ResultSet rs,List<Emp> lst) throws SQLException{
		Emp emp=null;
		while(rs.next()) {
			emp = new Emp(rs.getInt("eid"),rs.getString("ename"),rs.getDouble("al"),rs.getString("dept"),rs.getDate("doj").toLocalDate());
			lst.add(emp);
		}
		return lst;		
	}
	@Override
	public List<Emp> viewEmployee(String dept) {
		List<Emp> lst=new ArrayList<Emp>();
		try(Connection conn = DriverManager.getConnection(DaoFactory.DBURL)){
			PreparedStatement st=conn.prepareStatement(HQueries.viewByDept);
			st.setString(1,dept);
			ResultSet rs = st.executeQuery();
			return lst;
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return lst;
	}
	@Override
	public boolean removeEmployee(int eid) throws IDException {
		// TODO Auto-generated method stub
		return false;
	}

}
