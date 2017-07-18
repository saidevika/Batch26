package operator;

/*dfd
df
dfd
fd
fd
fd
f
d
*/

/*
 * dfdfd
 * dfd
 * fdfd
 * fd
 * 
 */
public class LogicalOperator {

	public static void main(String[] args) {
		int yourAge = 21;
		int yourFriendsAge = 20;
		String schoolName = "St.Joseph";
		
		boolean areYouElig = (yourAge >= 21);
		boolean isYourFriendElig = (yourFriendsAge >= 21);
		
		boolean areUBothElig = (areYouElig & isYourFriendElig); // false & false
		//boolean areUBothElig = areYouElig && isYourFriendElig; // false && false
		
		System.out.println("Are you eligible for drinking " + areYouElig);
		
		System.out.println("Is your friend eligible for drinking "  + isYourFriendElig);
		
		System.out.println("Are you guys eligible "
				+ " for Drinking alcohol together " + areUBothElig);
		
		if(areUBothElig){
			System.out.println("You guys go ahead and enjoy");
		}else{
			System.out.println("Lets wait for you guys to grow up...");
		}
		
		
		int age = 3;
		int height = 3;
		// as we are using a short circuit AND and the first statement is false
		boolean flag = (age++ >= 5) && (height++ > 3); // false & false
		
		boolean flag2 = (4 > 2) || ((9>5) & (6<9) | (5>2) && ("test".equals("hello")));
		
		System.out.println(age);
		
		System.out.println(height);
		
		
	}

}
