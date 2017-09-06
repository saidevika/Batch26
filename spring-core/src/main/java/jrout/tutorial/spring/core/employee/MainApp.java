package jrout.tutorial.spring.core.employee;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import jrout.tutorial.spring.core.employee.domain.Employee;
import jrout.tutorial.spring.core.employee.service.IEmployeeService;
public class MainApp {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		IEmployeeService empService = (IEmployeeService)factory.getBean("employeeService");
		
		List<Employee> empList = empService.getEmployees("");
		for(Employee emp : empList){
			System.out.println(emp);
			printMe(emp);
		}
		//empList.forEach(System.out::println);
		//empList.forEach(MainApp::printMe);
	}
	
	public static void printMe(Employee emp){
		System.out.println(emp);
	}
}