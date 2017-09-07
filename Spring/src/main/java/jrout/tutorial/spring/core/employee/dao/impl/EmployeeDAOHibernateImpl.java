package jrout.tutorial.spring.core.employee.dao.impl;

import jrout.tutorial.spring.core.employee.dao.IEmployeeDAO;
import jrout.tutorial.spring.core.employee.domain.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDAOHibernateImpl implements IEmployeeDAO {

	@Override
	public List<Employee> getEmployees(String departmentName) {

		// Hibernate
		List<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee("34","Raj","Malhotra");
		Employee emp2 = new Employee("35","Depan","Patel");
		empList.add(emp1);

		empList.add(emp2);

		return empList;
	}
}
