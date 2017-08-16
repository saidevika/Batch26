package thread;

public class WaitNotify {

	public static void main(String[] args) {
		RolexWatch watch = new RolexWatch();
		watch.start();
		synchronized(watch){
			try {
				watch.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Watch has given the time...as "+ watch.time);
	}

}

class RolexWatch extends Thread {
	int time = 0;
	@Override
	public void run() {
		synchronized(this){
			for(int i =0 ; i < 5 ; i++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " "+ i);
				time += i;
			}
			notify();
		}
		
	}
}