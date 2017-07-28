package classesexample;

public class MainAppObjectReference {

	public static void main(String[] args) {
		Student aida = new Student();
		aida.name = "Aida";
		
		System.out.println(aida.name);
		changeName(aida);
		System.out.println(aida.name);
		
		// call by reference
		// call by value
		// is java call by reference or call by value.
		
		int a = 20;
		add(a);
		System.out.println(a);
	}
	
	public static void changeName(Student student){
		student.name = "Rohini";
	}
	
	public static void add(int a){
		a = 4;
	
	}
}
