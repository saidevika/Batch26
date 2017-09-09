package jrout.tutorial.spring.core.employee.domain;

import java.io.Serializable;

public class Employee implements Serializable {
	private String empId;
	private String firstName;
	private String lastName;
	public Employee(){}
	public Employee(String empId, String firstName, String lastName){
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EmpID :"+ empId +" FirstName "+ firstName +" LastName "+ lastName;
	}
}
