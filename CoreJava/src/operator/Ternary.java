package operator;

public class Ternary {

	public static void main(String[] args) {
		
		int yourAge = 21;
		int yourFriendsAge = 20;
		
		boolean areYouElig = (yourAge >= 21);
		boolean isYourFriendElig = (yourFriendsAge >= 21);
		
		String message = (areYouElig && isYourFriendElig) ? "Eligible" : " Not Eligible";
		
		String name = "Testing";
		System.out.println(message);
		
	}

}
