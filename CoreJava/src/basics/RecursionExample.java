package basics;

public class RecursionExample {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.fact(3)); // 2 * 1
	}
}

class Factorial {
	
	public int fact(int num){
		int result = 0;
		if(num == 1) 
			return 1;
		
		//result = 3 * 2 * 1;
		result = fact(num - 1) * num;
		return result;
	}
}
