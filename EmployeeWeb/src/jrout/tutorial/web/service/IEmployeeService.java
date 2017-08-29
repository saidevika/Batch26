package jrout.tutorial.web.service;

import jrout.tutorial.web.domain.Employee;

public interface IEmployeeService {
	Employee fetchEmployee(int empId);
}
