package classesexample;

// setName method belongs to JavaStudent class
//setName method belongs to JavaStudent class
public class JavaStudent { // POJO : Plain Old Java Object
	private String name; // Instance Variable
	private int age;
	private String placeOfBirth; // properties or state
	
	private Address address;
	private Dog dog;
	

	public JavaStudent(String name){//Constructors
		this.name = name;
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
