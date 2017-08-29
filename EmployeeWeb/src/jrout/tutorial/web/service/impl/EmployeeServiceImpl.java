package jrout.tutorial.web.service.impl;

import jrout.tutorial.web.dao.IEmployeeDAO;
import jrout.tutorial.web.dao.impl.EmployeeDAOImpl;
import jrout.tutorial.web.domain.Employee;
import jrout.tutorial.web.service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService{

	@Override
	public Employee fetchEmployee(int empId) {
		
		IEmployeeDAO employeeDao = new EmployeeDAOImpl();
		return employeeDao.fetchEmployee(empId);
	}

}
