package classesexample;

public class MainAppMethodExample {

	public static void main(String[] args) {
		Student aida = new Student();
		aida.name = "Aida";
		aida.age = -1;
		aida.placeOfBirth = "India";
		
		Student rohit = new Student();
		rohit.name = "Rohit";
		rohit.age = 17;
		rohit.placeOfBirth = "India";
		
		printInfo(rohit);
		printInfo(aida);
//		System.out.println("Age ="+ aida.age + " Name = "+ aida.name +" POB ="+ aida.placeOfBirth);
//		System.out.println("Age ="+ rohit.age + " Name = "+ rohit.name +" POB ="+ rohit.placeOfBirth);
	}
	
	public static void printInfo(Student student){
		printStudentDetails(student);
		checkStudentAgeForDriving(student);
	}
	
	public static void printStudentDetails(Student student){
		System.out.println("Age ="+ student.age + " Name = "+ 
				student.name +" POB ="+ student.placeOfBirth);

	}
	
	public static void checkStudentAgeForDriving(Student student){
		if(student.age >16){
			System.out.println("Eligible for driving");
		}else{
			System.out.println("NOt Eligibile for Driving..");
		}
	}
	
}
