package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a Programming Language ");
		String input = scan.next();
		
		System.out.println("Please enter "+ input +" Version(Only Integers) also :");
		
		//int version = scan.nextInt();
		int version = 0;
		try{
			version = Integer.parseInt(scan.next());
		}catch(Exception e){
			e.printStackTrace();
			version = 7;
		}
		
		
		boolean isJavaClass = "Java".equals(input);
		
		if(isJavaClass){
			System.out.println("This is Java class where I teach Java Version "+ version);
		}else {
			System.out.println("Don't know what class is this");
		}
		
		
	}

}
