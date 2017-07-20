package classesexample;

public class MainApp {

	public static void main(String[] args) {
		Student aida = new Student();
		aida.name = "Aida";
		aida.age = 16;
		aida.placeOfBirth = "India";
		
		Student deepthi = new Student();
		deepthi.name = "Deepthi";
		deepthi.age = 17;
		deepthi.placeOfBirth = "USA";
		
		System.out.println(aida.name);
		System.out.println(deepthi.name);
		
		deepthi.name = "Depthi";
		System.out.println(deepthi.name);
		System.out.println(aida.name);
		
		Student hiren = new Student();
	//	hiren.age = 0;
		System.out.println(hiren.age);
		System.out.println(hiren.name);
		System.out.println(hiren.placeOfBirth);
		
	}

}
