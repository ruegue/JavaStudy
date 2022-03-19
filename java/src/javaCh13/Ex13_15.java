package javaCh13;

public class Ex13_15 {
	static boolean stopped = false;
	
	public static void main(String[] args) {
		Thread5 t1 = new Thread5();
		t1.start();
		
		try {
			Thread.sleep(6*1000);
		} catch (InterruptedException e) {}
		
		stopped = true;
		t1.interrupt();
		
		System.out.println("stopped");
		
	}

}

class Thread5 extends Thread{
	public void run() {
		for(int i = 0; !Ex13_15.stopped; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(4*1000);
			} catch (InterruptedException e) {}
		}
	}
}