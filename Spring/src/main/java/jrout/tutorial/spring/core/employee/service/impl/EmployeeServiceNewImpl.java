package jrout.tutorial.spring.core.employee.service.impl;

import jrout.tutorial.spring.core.employee.domain.Employee;
import jrout.tutorial.spring.core.employee.service.IEmployeeService;

import java.util.List;

public class EmployeeServiceNewImpl implements IEmployeeService{

	public EmployeeServiceNewImpl(){
		System.out.println("EmployeeServiceNewImpl:: Constructor is invoked...");
	}
	public List<Employee> getEmployees(String departmentName) {
		return null;
	}
}