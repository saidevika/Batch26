package inheritance;

public class NonITEmployees extends Employee { // is a relationship
	
	private String floorWork; // I am from Floor1
	
	public NonITEmployees(String name, int id) {
		super(name, id);
	}
	
	public String getFloorWork() {
		return floorWork;
	}
	public void setFloorWork(String floorWork) {
		this.floorWork = floorWork;
	}
}