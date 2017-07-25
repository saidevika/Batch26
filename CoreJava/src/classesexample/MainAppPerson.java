package classesexample;

public class MainAppPerson {

	public static void main(String[] args) {
		Person john = new Person();
		john.name = "John";
		john.age = 35;
		john.ssn = 3456789;
		
		Person wife = new Person();
		wife.age = 34;
		wife.name = "Roja";
		wife.ssn = 7854443;
		
		john.wife = wife;
		
		Person johnDaugh = new Person();
		johnDaugh.age = 10;
		johnDaugh.name = "Seema";
		johnDaugh.ssn = 33333;
//		johnDaugh.father = john;
		john.daugher = johnDaugh;
		
		
	}

}
