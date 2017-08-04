package abstractexample;

public class MainApp {
	public static void main(String...arg){
		//Human human = new Human();

		Human ih = new IndianHuman();
		printDetails(ih);

		Human ah = new AfricanHuman();
//		ah.runningSpeed();
		printDetails(ah);
		
		
	}
	
	public static void printDetails(Human ih){
		ih.runningSpeed();
	}

}
