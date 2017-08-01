package classesexample;

// setName method belongs to JavaStudent class
//setName method belongs to JavaStudent class
public class JavaStudent { // POJO : Plain Old Java Object
	private String name; // Instance Variable
	private int age;
	private String placeOfBirth; // properties or state
	
	private Address address; // has a relationship
	private Dog dog;
	
	//public JavaStudent(){}
	
	public JavaStudent(String name){//Constructors
		this.name = name;
	}
	
	public JavaStudent(String name, int age){//Constructors
//		this.name = name;
		this(name);
		this.age = age;
	}
	
	public JavaStudent(String name, int age, String placeOfBirth){//Constructors
//		this.name = name;
//		this.age = age;
		this(name,age);
		this.placeOfBirth  = placeOfBirth;
	}
	
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
