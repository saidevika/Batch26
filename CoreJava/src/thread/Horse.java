package thread;

public class Horse extends Thread {
	
	@Override
	public void run() {
		runForMe();
	}
	public void runForMe(){
		for(int i = 0 ; i < 5; i++){
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println(" Running...Distance "+ i +" Miles" +" "+ Thread.currentThread().getName());
		}
	}
}
