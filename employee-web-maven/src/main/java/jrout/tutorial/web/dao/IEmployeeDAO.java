package jrout.tutorial.web.dao;

import jrout.tutorial.web.domain.Employee;

public interface IEmployeeDAO {
	Employee fetchEmployee(int empId);
}
