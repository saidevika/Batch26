package inheritance;

import inheritance.hr.ITHR;

public class MainApp {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Rohan",1234);
		emp.setDept("Networking");
		
		NonITEmployees nie = new NonITEmployees("Ramu", 2345);
		nie.setFloorWork("Floor1");
		nie.setDept("Printing Department");

		MgmtEmployee me = new MgmtEmployee("Rahul",12);
		me.setMeeting("I review all Performance");
		me.setDept("Higher Mgmt Dept");
		
		
		ITHR ithr =new ITHR("John",2390);
		
	}

}
