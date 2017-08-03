package inheritance;

public class MainAppOverriding {

	public static void main(String[] args) {
//		Employee me = new MgmtEmployee("Raja", 34);
//		me.tieColor();
		//System.out.println(me.getMeeting());
//		System.out.println(Integer.toHexString(me.hashCode()));
//		System.out.println(me.toString());
		
//		Employee nite = new NonITEmployees("Rohit", 34);
//		nite.tieColor();
//		System.out.println(nite);
		
		MainAppOverriding mao = new MainAppOverriding();
		
		MgmtEmployee me = new MgmtEmployee("Raja", 34);
		me.setMeeting("We Mgmt Guys have always meeting..");
//		mao.printMgmtDetails(me);
		mao.printDetails(me);
		
		NonITEmployees nite = new NonITEmployees("Rohit", 34);
//		mao.printNonItDetails(nite);		
		mao.printDetails(nite);
	}
	
	public void printDetails(Employee emp){
		emp.tieColor();
		
//		NonITEmployees employee = (NonITEmployees)emp;
//		employee.getDept();
		
		if(emp instanceof MgmtEmployee){
			MgmtEmployee me = (MgmtEmployee)emp;
			System.out.println(me.getMeeting());
		}else if(emp instanceof NonITEmployees){
			
		}
	}
	
	
	/*public void printMgmtDetails(MgmtEmployee emp){
		emp.tieColor();
		System.out.println(emp.getMeeting());
	}
	
	public void printNonItDetails(NonITEmployees emp){
		emp.tieColor();
		System.out.println(emp.getFloorWork());
	}*/
}
