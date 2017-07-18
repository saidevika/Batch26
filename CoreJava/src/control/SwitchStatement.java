package control;

import java.sql.Date;

public class SwitchStatement {

	public static void main(String[] args) {
		String day = "TUE";
//		java.util.Date date = new java.util.Date();
//		System.out.println(date.getDay());
		
		
		/*if(day == "MON"){ // 1 min
			System.out.println("Its the first day to Office..");
		}else if(day == "TUE"){ // 1 min
			System.out.println("Fun day at office..");
		}else if(day == "WED"){ // 1 min
			System.out.println("Its time to have some serious work");
		}else{
			System.out.println("Today is a day for gossiping...");
		}*/
		
		
		switch (day) {
		case "MON":
			System.out.println("Its the first day to Office..");
			break;
		case "TUE":
			System.out.println("Fun day at office..");
			break;
		case "WED":
			System.out.println("Its time to have some serious work");
			break;
		default:
			System.out.println("Today is a day for gossiping...");
			break;
		}
		
	}

}
