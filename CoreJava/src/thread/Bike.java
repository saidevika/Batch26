package thread;

public class Bike implements Runnable{
	@Override
	public synchronized void run() {
		for(int i=0 ; i < 5 ; i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Running by Bike "+ i +"miles for Thread "+ Thread.currentThread().getName());
		}
	}
}
