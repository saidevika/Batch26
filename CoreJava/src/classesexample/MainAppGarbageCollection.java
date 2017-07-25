package classesexample;

// java MainAppConstructor
public class MainAppGarbageCollection {

	public static void main(String[] args) {
//		Person per1 = new Person();
//		Person per2 = new Person();
//		Person per3 = new Person();
//		
//		System.out.println(per1.age);
//		System.out.println(per3.age);
//		
//		Person per4 = new Person();
//		
//		System.out.println(per1.age);
////		System.out.println(per2.age);
////		System.out.println(per3.age); // still reacheable
//		
//		per1 = null;
		
		for(int i = 0 ; i < 50000; i++){
			Mouse mouse = new Mouse("Name"+i);
		}
		
	}
	
	
	
}

class Mouse{
	String name;
	public Mouse(String name){
		this.name = name;
		System.out.println("Mouse created with name "+ name);
	}
	
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Mouse is destroyed =============" + name);
	}
}
