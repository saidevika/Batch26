package classesexample;

// java MainAppConstructor
public class MainAppMethods {
	// From a static method, you cannot invoke a non-static method.
	
	public static void main(String[] args) {
		MainAppMethods mam = new MainAppMethods();
		int a = 10;
		int b = 20;
		int c = 30;
//		System.out.println(mam.add(a,b));
//		System.out.println(mam.add(a,b,c));
//		
//		System.out.println(a+b);//30
//		System.out.println("Hello "+" World");
		
		mam.sub(200, 2 , 1,2,3,4,5,6,7,9);
		
	}
	
	public void sub(int mainValue , int...toSubstract){
		System.out.println(mainValue-toSubstract[0]-toSubstract[1]);
	}
	
	public int add(int a , int b){
		return a+b;
	}
	
	public int add(int a , int b, int c){
		return a+b+c;
	}
	
	public void add(int a , int b, String message){
		System.out.println(message + " "+ (a +b));
	}
	
	public void divide(int a , int b){
		System.out.println(a);
//		System.out.println(" Division = "+a/b);
//		
//		if(a == 9)
//			return;
//		
//		System.out.println("I am in the end of the divid logic");
	}
	
	
	public void play(){
		System.out.println("I am going to play");
//		putOnShoes();
//		grabBall();
//		runToGround();
	}
	
	public void putOnShoes(){
		System.out.println("Put on Shoes");
	}
	
	public void grabBall(){
		System.out.println("Grab the ball");
	}
	
	public void runToGround(){
		System.out.println("Running to ground");
	}
	
	public int calculateTax(String ssn){
		///some calcuation
		int a = 3400;
		return a;
	}
	
}
