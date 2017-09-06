package jrout.tutorial.spring.core.employee.dao.impl;

import jrout.tutorial.spring.core.employee.dao.IEmployeeDAO;
import jrout.tutorial.spring.core.employee.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements IEmployeeDAO {

	@Override
	public List<Employee> getEmployees(String departmentName) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("34","Raj","Malhotra"));
		empList.add(new Employee("35","Depan","Patel"));
		return empList;
	}
}
