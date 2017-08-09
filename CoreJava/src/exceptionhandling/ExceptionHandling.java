package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a Programming Language ");
		String input = scan.next();
		
		System.out.println("Please enter "+ input +" Version(Only Integers) also :");
		
		//int version = scan.nextInt();
		int version = getVersion(scan.next());
		
//		Integer val = 67;
//		int val2  = val; // auto boxing...
		
		System.out.println("Enter Discount Value you ");
		
		Integer discount = Integer.parseInt(scan.next()); // Integer is Wrapper Type , and int is premetive type
		/*try {
			version = getVersion(scan.next());
		} catch (Exception e) {
			e.printStackTrace();
			version = 9;
		}*/
		
		/*try{
			version = Integer.parseInt(scan.next());
		}catch(Exception e){
			e.printStackTrace();
			version = 7;
		}finally{
			System.out.println("This is my finally block");
		}*/
		
		
		boolean isJavaClass = "Java".equalsIgnoreCase(input);
		
		if(isJavaClass){
			System.out.println("This is Java class where I teach Java Version "+ version);
			int discountAmont = version/discount;
			System.out.println("You got a discount of $"+ discountAmont);
			
		}else {
			System.out.println("Don't know what class is this");
		}
		
		
	}
	
	
	/*public static int getVersion(String version) throws Exception {
		return Integer.parseInt(version);
		int versionNum = 0;
		try{
			versionNum = Integer.parseInt(version);
		}catch(Exception e){
			e.printStackTrace();
			versionNum = 7;
		}finally{
			System.out.println("This is my finally block");
		}
		return versionNum;
	}*/
	
	
	public static int getVersion(String version) throws NumberFormatException {
		return Integer.parseInt(version);
	}
}
