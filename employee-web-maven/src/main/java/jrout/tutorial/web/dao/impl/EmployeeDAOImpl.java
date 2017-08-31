package jrout.tutorial.web.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import jrout.tutorial.web.dao.IEmployeeDAO;
import jrout.tutorial.web.domain.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {
	String mysqlConnURL = "jdbc:mysql://localhost:3306/employees";
	String mysqlUsername = "root";
	String mysqlPassword = "root";
	
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public EmployeeDAOImpl(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(mysqlConnURL, mysqlUsername, mysqlPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Employee fetchEmployee(int empId) {
		Employee emp = new Employee();
		try {
			pstmt = (PreparedStatement) con.prepareStatement("select * from employees.employees where emp_no = ?");
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			
//			stmt = con.createStatement();
//			rs = stmt.executeQuery("select * from employees.employees where emp_no = "+empId);
			
			while(rs.next()){
				emp.setFirstName(rs.getString("first_name") );
				emp.setLastName(rs.getString("last_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return emp;
	}

}
