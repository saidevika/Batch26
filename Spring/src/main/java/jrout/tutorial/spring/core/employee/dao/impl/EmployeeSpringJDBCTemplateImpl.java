package jrout.tutorial.spring.core.employee.dao.impl;

import jrout.tutorial.spring.core.employee.dao.IEmployeeDAO;
import jrout.tutorial.spring.core.employee.dao.mapper.EmployeeRowMapper;
import jrout.tutorial.spring.core.employee.domain.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class EmployeeSpringJDBCTemplateImpl implements IEmployeeDAO {

	@Resource
	private JdbcTemplate jdbcTemplate;

	/*@Override
	public List<Employee> getEmployees(String lastName){
		List<Employee> empList = new ArrayList<>();
		List employees = new ArrayList();
		String qry = "select emp_no as empId , first_name as firstName , last_name as lastName from employees where last_name = ?";
		employees = jdbcTemplate.queryForList(qry, new Object[]{lastName});
		for(int i =0 ; i < employees.size(); i++){
			Map map = (Map)employees.get(i);
			empList.add(new Employee((Integer)map.get("empId")+"", (String)map.get("firstName"), (String)map.get("lastName")));
		}

		return empList;
	}*/

	@Override
	public List<Employee> getEmployees(String lastName){
		List<Employee> empList = new ArrayList<>();
		List employees = new ArrayList();
		String qry = "select emp_no as empId , first_name as firstName , last_name as lastName from employees where last_name = ?";
		empList = jdbcTemplate.query(qry, new Object[]{lastName}, new EmployeeRowMapper());
		return empList;
	}
}