package exceptionhandling;

import java.util.Scanner;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a Programming Language ");
		String input = scan.next();
		System.out.println("Enter you name");
		String name = scan.next();
		
		System.out.println("Please enter "+ input +" Version(Only Integers) also :");
		
		int version = 0;
		int discountAmont = 0;
		try {
			version = Integer.parseInt(scan.next()); // NumberFormatException
			System.out.println("Enter Discount Value you ");
			Integer discount = Integer.parseInt(scan.next());
			discountAmont = version/discount; // ArithmeticException
			
		}catch (NumberFormatException exp) {
			version = 9;
			discountAmont = 5;
			exp.printStackTrace();
		}catch(ArithmeticException exp){
			discountAmont = 0;
		}catch(NullPointerException npe){
			version = 7;
			discountAmont = 2;
		}catch(Exception exp){
			version = 4;
			discountAmont = 10;
		}finally{
			System.out.println("Finally block...");
		}
		
		boolean isJavaClass = "Java".equalsIgnoreCase(input);
		
		if(isJavaClass){
			System.out.println("This is Java class where I teach Java Version "+ version);
			System.out.println("You got a discount of $"+ discountAmont);
			String message = "";
			try {
				message = getMessage(name);
			} catch (NotProperNameException e) {
				e.printStackTrace();
			}
			System.out.println(message);
		}else {
			System.out.println("Don't know what class is this");
		}
	}

	private static String getMessage(String name) throws NotProperNameException {
		if("blank".equalsIgnoreCase(name)){
			throw new NotProperNameException("Please enter proper name instead of Blank");
		}
		return "Welcome "+name +" to the java class";
	}
}
