package inheritance;
//import java.lang.Object; // no need to import because it belongs to the java.lang package

public class Employee { // extends Object { : no need to extend, because every call by default extends Object class
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
	
	public void tieColor(){
		System.out.println(dept +" : "+name + " Wear a Blue Color Tie");
	}
	
	@Override
	public String toString() {
		return dept +": Employee Name "+ name +" EmpID "+ id; 
	}
}
