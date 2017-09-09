package jrout.tutorial.spring.core.employee.dao.impl;

import jrout.tutorial.spring.core.employee.dao.IEmployeeDAO;
import jrout.tutorial.spring.core.employee.domain.Employee;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeSpringJDBCDAOImpl implements IEmployeeDAO {

	@Resource
	private DataSource dataSource;

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

	@Override
	public List<Employee> getEmployees(String lastName){
		List<Employee> empList = new ArrayList<>();
		try {
			con = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select 23 empId , 'Rajat' firstName , 'Sharma' lastName from dual");

			while(rs.next()){
				empList.add(new Employee(rs.getString("empId"),rs.getString("firstName"),rs.getString("lastName")));
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

		return empList;
	}
}