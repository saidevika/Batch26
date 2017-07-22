package classesexample;

public class MainAppGetterSetter {

	public static void main(String[] args) {
//		JavaStudent aida = new JavaStudent(); // this is default constructor

		JavaStudent aida = new JavaStudent("Aida"); //creation
//		aida.setName("Aida"); // initialization
		aida.setAge(18);
		// creation and init.
		
//		aida.setAge(17);
//		aida.setPlaceOfBirth("India");
		
		
//		System.out.println(aida.getName());
//		if(aida.getAge() > 15 && "India".equals(aida.getPlaceOfBirth())){
//			System.out.println(aida.getName() +" Is a good Dancer...");
//		}
		
		Address address = new Address();
		address.setAddress1("Address1");
		address.setCity("Burlington");
		address.setState("Mass");
		
		aida.setAddress(address);
		
		
		System.out.println(aida.getName());
		System.out.println(aida.getAge());
		Address myAddress = aida.getAddress();
		
		
		System.out.println(myAddress.getCity());
		
	}
}
