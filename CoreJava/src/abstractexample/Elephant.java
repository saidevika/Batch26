package abstractexample;

public class Elephant extends Animal implements Swimming , Eating{
	
	private String type;

	public Elephant(){}
	public Elephant(String type){
		this.type = type;
	}
	public void myColor(){
		
	}
	
	@Override
	public void swimSpeed() {
		System.out.println(type +":  Elephants swim at a pace of 10 miles HR");
	}

	@Override
	public void eat() {
		System.out.println("Elephants eat a loooooooot");
		
	}
}
