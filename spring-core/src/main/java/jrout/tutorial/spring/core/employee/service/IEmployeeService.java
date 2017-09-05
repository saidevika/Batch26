package jrout.tutorial.spring.core.employee.service;

import java.util.List;

import jrout.tutorial.spring.core.employee.domain.Employee;

public interface IEmployeeService {
	List<Employee> getEmployees(String departmentName);
}