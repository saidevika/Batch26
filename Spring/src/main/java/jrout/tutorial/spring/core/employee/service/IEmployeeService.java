package jrout.tutorial.spring.core.employee.service;

import jrout.tutorial.spring.core.employee.domain.Employee;

import java.util.List;

public interface IEmployeeService {
	List<Employee> getEmployees(String departmentName);
}