package inheritance.hr;

public class ITHR extends HR {

	private int programmingExperience;
	
	public ITHR(String name, int id) {
		super(name, id);
	}

	public int getProgrammingExperience() {
		return programmingExperience;
	}

	public void setProgrammingExperience(int programmingExperience) {
		this.programmingExperience = programmingExperience;
	}
	
	
}
