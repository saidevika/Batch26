package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCProgram {

	public static void main(String[] args) {
		String mysqlConnURL = "jdbc:mysql://localhost:3306/employees";
	    //String oracleConnURL = "jdbc:oracle:thin:@localhost:1521/XE";

		String mysqlUsername = "root";
		String mysqlPassword = "root";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
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
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employees.employees where emp_no = 10020");
//			List<Employees> list = new ArrayList();
			
			while(rs.next()){
				System.out.println(rs.getString("emp_no") +" "+ rs.getString("first_name"));
				// create each employee object and set it to a list.
//				list.add(obj);
			}
			
//			printEmployeeDetails(list);
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
		
		
	}

	
//	public void printEmployeeDetails(List<Employees> employees){
//		// enhanced for loop to print all the emp information...
//	}
}
