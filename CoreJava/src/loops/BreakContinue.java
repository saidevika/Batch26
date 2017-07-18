package loops;

/**
 * Print everything untill 12...
 * print all the even number from 1 to 100 (%)
 * @author jrout
 *
 */
public class BreakContinue {

	public static void main(String[] args) {
		int ages[] = { 20, 28, 33, 4, 5, 6, 7, 8, 12, 21, 34, 56, 78 };
		
		
		for(int age : ages){
			
			if(age == 12)
				continue;
			
			System.out.println("Age ="+ age);
			
//			if(age == 12) break;
//			System.out.println("Age ="+ age);
			
			
		}
		
	}

}
