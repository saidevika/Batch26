package array;

public class ArrayExample {
	// java HW x y z
	public static void main(String[] args) {
		
//		int a = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);
//		System.out.println(a+b);
//		System.out.println(args[5]);
//		System.out.println(args.length);
//		System.out.println(args[0]+args[1]);
		
		int age = 3;
		int ages[] = {20,21,28,33};
		String names[] = {"Aida","Kamakshi","Hiren"};
//		float bag[] = new float[10];
		
		int bag[] = new int[10];
		bag[3] = age;
		bag[9] = 9;
//		bag[12] = 43;
		
//		System.out.println(bag[0]);
//		System.out.println(bag[9]);
//		System.out.println(bag[10]);
//		System.out.println(bag.length);
//		int length = ages.length;
		
		for(int i = 0 ; i < ages.length ; i++){
			//System.out.println(ages[i]);
			System.out.println(ages[i]);
//			ages[0] = 20
//			ages[1] = 21
		}
		System.out.println("------------");
		for(int val : ages){
			System.out.println(val);
		}
		
		
		
	}
}