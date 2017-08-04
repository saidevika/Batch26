package abstractexample;

public class MainAppInterface {
	public static void main(String...arg){
		
		Swimming ih = new IndianHuman();
		Swimming elephant = new Elephant("AfricanElephant");

		printSwimmingDetails(ih);
		printSwimmingDetails(elephant);

//		Eating eatAfrican = new AfricanHuman();
//		Eating eatElephant = new Elephant();
		
	}
	
	public static void printSwimmingDetails(Swimming swim){
		swim.swimSpeed();
	}

}
