package jrout.tutorial.spring.core.employee.service;

import java.util.ArrayList;
import java.util.List;

import jrout.tutorial.spring.core.employee.domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService{

	public List<Employee> getEmployees(String departmentName) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("34","Raj","Malhotra"));
		empList.add(new Employee("35","Depan","Patel"));
		return empList;
	}
}