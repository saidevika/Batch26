package jrout.tutorial.spring.core.employee.service.impl;

import jrout.tutorial.spring.core.employee.dao.IEmployeeDAO;
import jrout.tutorial.spring.core.employee.domain.Employee;
import jrout.tutorial.spring.core.employee.service.IEmployeeService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component(value = "employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Resource(name = "employeeSpringJDBCTemplateImpl")
	private IEmployeeDAO employeeDAO;

	public List<Employee> getEmployees(String lastName) {
		return employeeDAO.getEmployees(lastName);
	}
}