package thread;

public class ThreadExample {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
//		Horse blackHorse = new Horse();
//		blackHorse.setName("Blacky");
//		blackHorse.start();
//		
//		Horse whiteHorse = new Horse();
//		whiteHorse.setName("Whithy");
//		whiteHorse.start();
		
		Bike honda = new Bike();
		
		Thread johnThread = new Thread(honda,"John");
		johnThread.start();
		
		Thread charlieThread = new Thread(honda,"Charlie");
		charlieThread.start();
		
		System.out.println("I am at the END of the program...");
		
	}
}