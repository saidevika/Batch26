package inheritance;

public class Employee {
	private int id;
	private String name;
	private String dept;// Network // Software
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
