package basics;

public class StringBufferStringBuilderString {

	public static void main(String[] args) {
		
		int [] ages = {1,2,3,4,5,6,7,8,9,10};
		
		String message = "Ages are ";
		for(int age : ages){
			message += age+":";
		}
		
		StringBuffer messageBuffer = new StringBuffer();;;;;;;;;;
		messageBuffer.append("Ages are ");
		for(int age : ages){
			messageBuffer.append(age+":");
		}
		
		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append("Ages are ");
		for(int age : ages){
			messageBuilder.append(age+":");
		}
		//Ages are 1:2:3:4:5:6:7:8:9:10: -- Remove this extra colon
		// Ages are : 1:2:3:4:5:6:7:8:9:10
		
		System.out.println(messageBuffer);
		
	
	}

	
}
