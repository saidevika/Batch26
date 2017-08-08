package basics;

public class MainApp {

	public static void main(String[] args) {
		Phone iPhone1 = new Phone("Iphone",6);
		Phone iPhone2 = new Phone("Iphone",8);
		
		System.out.println(iPhone1 == iPhone2); // false
		
		System.out.println(iPhone1.equals(iPhone2)); // false...
		//System.out.println(iPhone1.equals(iPhone2));

		
//		String name11 = "Java Program";
//		String name22 = "Java Program";
//		
//		System.out.println("name11 == name22 : "+ (name11 == name22));
//		
//		String name1 = new String("Java Program");
//		String name2 = new String("Java Program");
//		
//		System.out.println("name1 == name2 : "+ (name1 == name2)); // false
//		System.out.println(name1.equals(name2)); // true
		
		
		
	}

}
