package operator;

public class ArithematicOperator {
	public static void main(String[] args) {
		//int age = 126;
		//String ageArg = args[0];
		int age = Integer.parseInt(args[0]);
		
		System.out.println("age is "+age);
		System.out.println("Your Height should be "+ (age+3));
		
		System.out.println("Ager after one year");
		//age = age +1;
		age++;
		System.out.println("age is "+age);
		age++;
		System.out.println("age is "+age);
	}
}