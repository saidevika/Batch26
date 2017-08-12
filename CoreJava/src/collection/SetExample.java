package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// SET
		Set<String> phones = new HashSet<>();
		
		phones.add("123-897-5678");
		phones.add("123-897-3456");
		phones.add("123-897-8888");
		phones.add("123-897-5678");
		
//		System.out.println(phones);
		
		
		// looping iterator everything is same as a list...
		
		Set<String> names = new TreeSet<>();
		names.add("Apple");
		names.add("Zebra");
		names.add("Boomer");
		names.add("Computer");
		
		for(String name : names){
			System.out.println(name);
		}
		
		System.out.println(names);
	}
	
	
	
}
