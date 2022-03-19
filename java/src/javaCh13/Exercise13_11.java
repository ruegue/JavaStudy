package javaCh13;

public class Exercise13_11 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1());
	
		t1.start();
	}

}
class Thread1 implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ; i<300; i++) {
			System.out.print('-');
		}
	}
	
}
