package jrout.tutorial.spring.core.employee.service.impl;

import jrout.tutorial.spring.core.employee.dao.IEmployeeDAO;
import jrout.tutorial.spring.core.employee.domain.Employee;
import jrout.tutorial.spring.core.employee.service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
	private IEmployeeDAO employeeDAO;
	public void setEmployeeDAO(IEmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	public List<Employee> getEmployees(String departmentName) {
		return employeeDAO.getEmployees(departmentName);
	}
}