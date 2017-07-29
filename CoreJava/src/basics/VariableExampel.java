package basics;

public class VariableExampel {
	public static void main(String...args){
		Tiger bengalTiger = new Tiger("BengalTiger", 6);
		
		Tiger siberianTiger = new Tiger("SiberianTiger", 4);
		Tiger africanTiger = new Tiger("AfricanTiger", 4);
//		bengalTiger.nature();
//		siberianTiger.nature();
		
//		System.out.println(Tiger.count);
//		
//		System.out.println(Math.floor(34.2));
		System.out.println(africanTiger.type);
	}
}

class Tiger {
	final String type = "Tiger";
	String name; // State
	int size; // State
	static int count;
	
	public Tiger(String name , int size){
		this.name = name;
		this.size = size;
		count++;
	}
	
	/**
	 * This is the behaviour of the instance.
	 * From a static method we cannot access not static method or variable.
	 */
	public void nature(){
		String message = "";
		if( size > 5) {
			message = name + " It is a dangerous Tiger";
		}else {
			message = name + " Not so dangerous Tiger";
		}
		System.out.println(message);
	}
	
	public static void callMe(){
		
	}
}
