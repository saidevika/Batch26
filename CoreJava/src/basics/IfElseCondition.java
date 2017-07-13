package basics;

public class IfElseCondition {

	public static void main(String[] args) {
		int yourAge = 16;
		boolean areYouElig = (yourAge >= 21);
		//System.out.println(areYouElig ? "You are eligible for drinking " : " Not Eligible for drinking" );
		
		if(areYouElig) {
			System.out.println("You are eligible for drinking");
		}else {
			System.out.println("You are not eligible");
			System.out.println("You shoud be at least 21 Years of age.");
		}
	}
}
