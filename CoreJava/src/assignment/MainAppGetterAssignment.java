package assignment;
import classesexample.JavaStudent;
import classesexample.Address;

public class MainAppGetterAssignment {

	public static void main(String[] args) {

		JavaStudent aida = new JavaStudent("Aida"); //creation
		aida.setAge(18);
		
		Address address = new Address();
		address.setAddress1("Address1");
		address.setCity("Burlington");
		address.setState("Mass");
		
		aida.setAddress(address);
		
		
		JavaStudent hiren = new JavaStudent("hiren"); //creation
		hiren.setAge(18);
		
		Address addressHiren = new Address();
		addressHiren.setAddress1("Address1");
		addressHiren.setCity("Burlington");
		addressHiren.setState("Mass");
		
		hiren.setAddress(address);
		
		
		System.out.println(aida.getName());
		System.out.println(aida.getAge());
		Address myAddress = aida.getAddress();
		
		
		System.out.println(myAddress.getCity());
		
	}
	
	// Come up with some logic to simplfy this code...
	// hint use method return type.
}
