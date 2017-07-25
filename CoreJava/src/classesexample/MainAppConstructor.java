package classesexample;

// java MainAppConstructor
public class MainAppConstructor {

	public static void main(String[] args) {
		
		Person person = new Person();
//		person.name;
		
//		JavaStudent hiren = new JavaStudent();
		
		JavaStudent aida = new JavaStudent("Aida"); //creation
		
		JavaStudent deepthi = new JavaStudent("Deepthi",18);
		
		JavaStudent anusha = new JavaStudent("Anusha",19,"India");
		//Create object of MainAppConstructor class
		MainAppConstructor mac = new MainAppConstructor();
		mac.play();
	}
	
	public void play(){
		putOnShoes();
		grabBall();
		runToGround();
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
	
}
