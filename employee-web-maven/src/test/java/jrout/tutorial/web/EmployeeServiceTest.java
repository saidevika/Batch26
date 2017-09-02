package jrout.tutorial.web;

//import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import jrout.tutorial.web.domain.Employee;
import jrout.tutorial.web.service.IEmployeeService;
import jrout.tutorial.web.service.impl.EmployeeServiceImpl;

public class EmployeeServiceTest {
	private IEmployeeService employeeService = null;
	
	@Before
	public void setUp() throws Exception {
		employeeService = new EmployeeServiceImpl();
	}

	@Test
	public void testFetchEmployee() {
		//IEmployeeService employeeService = new EmployeeServiceImpl();
		assertNotNull(employeeService);
		Employee employee = employeeService.fetchEmployee(10003);
		assertNotNull(employee); //Parto
		assertEquals("Parto", employee.getFirstName());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testFetchEmployee2() {
		//IEmployeeService employeeService = new EmployeeServiceImpl();
		assertNotNull(employeeService);
		Employee employee = employeeService.fetchEmployee(10005);
		assertNotNull(employee); //Parto
		assertEquals("Kyoichi", employee.getFirstName());
		//fail("Not yet implemented");
	}
	
	@After
	public void tearDown() throws Exception {
		employeeService = null;
	}
}
