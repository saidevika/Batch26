package abstractexample;

public class AfricanHuman extends Human implements Eating {
	private String africanHeight;
	private String africanHair;
	
	@Override
	public void runningSpeed() {
		System.out.println("Running speed for African is 10 miles/hr");
	}

	@Override
	public void eat() {
		System.out.println("I eat more than average humans");
		
	}
}
