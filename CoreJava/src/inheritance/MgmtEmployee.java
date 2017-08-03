package inheritance;

public class MgmtEmployee extends Employee {
	
	private String meeting; // meeting on performance 
	public MgmtEmployee(String name, int id) {
		super(name,id);
		super.setDept("Mgmt");
	}
	public String getMeeting() {
		return meeting;
	}
	public void setMeeting(String meeting) {
		this.meeting = meeting;
	}
	
	@Override
	public void tieColor(){
		System.out.println(super.getDept() +" : "+super.getName() + " Wear a Blue Color Tie with a Batch");
	}
	
	
}
