package loops;

public class ForLoop {

	public static void main(String[] args) {
		int ages[] = { 20, 28, 33, 4, 5, 6, 7, 8, 912, 21, 34, 56, 78 };

		boolean hasAge21 = false;
		/*for (int i = 0; i < ages.length; i++) {
			int presentAge = ages[i];
			if (presentAge == 21) {
				hasAge21 = true;
				break;
			}

		}*/
		int i = 0;
		/*while(i < ages.length){
			int presentAge = ages[i];
			if (presentAge == 21) {
				hasAge21 = true;
				break;
			}
			i++;
		}*/
		
		do {
			int presentAge = ages[i];
			if (presentAge == 21) {
				hasAge21 = true;
				break;
			}
			i++;
		} while (i < ages.length);
		
		if (hasAge21) {
			System.out.println("Yes this array has a person with age 21");
			System.out.println("Yes this array has a person with age 21");
		}
		
		
	}

}
