package jrout.tutorial.spring.core.employee.dao;

import jrout.tutorial.spring.core.employee.domain.Employee;

import java.util.List;

public interface IEmployeeDAO {
	List<Employee> getEmployees(String lastName);

}
