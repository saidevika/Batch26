package inheritance;

public class MgmtEmployee extends Employee {
	
	private String meeting; // meeting on performance 
	public MgmtEmployee(String name, int id) {
		super(name,id);
	}
	public String getMeeting() {
		return meeting;
	}
	public void setMeeting(String meeting) {
		this.meeting = meeting;
	}
}
