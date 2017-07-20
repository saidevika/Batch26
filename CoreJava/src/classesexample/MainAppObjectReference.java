package classesexample;

public class MainAppObjectReference {

	public static void main(String[] args) {
		Student aida = new Student();
		aida.name = "Aida";
		aida.age = 16;
		aida.placeOfBirth = "India";
		
		Student aidaReference2 = aida;
		
		System.out.println(aida.name);
		System.out.println(aidaReference2.name);
	}

}
