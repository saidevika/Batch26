package control;

public class IfElseExample {

	public static void main(String[] args) {
		/*boolean isJavaDeveloper = true ;
		int age = 14;
		System.out.println(isJavaDeveloper);
		
		if(isJavaDeveloper){
			System.out.println("Attend class by 8:30");
			if(age < 15){
				System.out.println("Is a young java developer");
			}
		}else {
			System.out.println("Talk to admin guys for other timings..");
		}*/
		
		// Print Morning or Afternoon or Evening based out of the current time.
		
		System.out.println("Today date is "+ new java.util.Date());
		String day = "MON";
		
		if(day == "MON"){
			System.out.println("Its the first day to Office..");
		}else if(day == "TUE"){
			System.out.println("Fun day at office..");
		}else if(day == "WED"){
			System.out.println("Its time to have some serious work");
		}else{
			System.out.println("Today is a day for gossiping...");
		}
		
		if(day == "MON"){
			System.out.println("Its the first day to Office..");
		}  
		if(day == "TUE"){
			System.out.println("Fun day at office..");
		}  
		if(day == "WED"){
			System.out.println("Its time to have some serious work");
		} 
			
	}

}
