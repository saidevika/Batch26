package jrout.tutorial.spring.core.employee.service;

import java.util.ArrayList;
import java.util.List;

import jrout.tutorial.spring.core.employee.domain.Employee;

public class EmployeeServiceNewImpl implements IEmployeeService{

	public List<Employee> getEmployees(String departmentName) {
		Employee emp1  = new Employee("34","Raj","Malhotra");
		Employee emp2  = new Employee("3","Depan","Patel");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		
		return empList;
	}
}