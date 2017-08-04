package abstractexample;

public class IndianHuman extends Human implements Swimming {
	private String indianFood;
	
	@Override
	public void runningSpeed() {
		System.out.println("Running speed for Indian is 6 miles/hr");
	}
	
	@Override
	public void swimSpeed() {
		System.out.println("Indians swim at a pace of 5 miles HR");
	}
	
	
}
