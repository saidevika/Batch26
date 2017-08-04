package inheritance;

public class MainAppOverriding2 {

	public static void main(String[] args) {
		NonITEmployees devika = new NonITEmployees("Devika", 1234){
			@Override
			public void tieColor() {
				System.out.println("Devika Wear a Blue Color Tie with Silver Batch");
			}
		};
		devika.tieColor();
	}
}
