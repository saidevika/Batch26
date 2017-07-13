package array;

public class ArrayExample2D {
	// java HW x y z
	public static void main(String[] args) {
		int age = 3;
		
		/*
		 * Pring names and Ages for each index 
		 */
		
		String names[] = {"Raji","Rupesh","Tom"};
		
		String ages[] = {"12","34","45"};
		
		System.out.println(names[1]);
		
		String rajiD[] = {"Raji","12","6"};
		
		System.out.println("--->"+rajiD[0] +" " + rajiD[1]);
		
		
		String rupeshD[] = {"Rupesh","34","5","Java Developer"};
		String tomD[] = {"Tom","45","7"};

		String personDetails[][] = {rajiD,rupeshD,tomD};
		
//		System.out.println(personDetails[1][0]);
//		System.out.println(personDetails[1][1]);		
		
		System.out.println(personDetails[0][1]);
		
		for(int i = 0 ; i < personDetails.length; i++){
			
		}
		
		/**
		 * Name = Raji , Age = 12
		 * Name = Rupesh , Age = 34
		 */
		
	}
}