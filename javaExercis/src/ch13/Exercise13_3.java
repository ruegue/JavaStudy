package ch13;

public class Exercise13_3 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Thread3_1 t1 = new Thread3_1();
		
		t1.start();
		
		
		
		for(int i= 0; i < 300 ; i++)
			System.out.printf("%s",new String("-"));
		
		try {
			t1.join();
		} catch (InterruptedException e) {
		}
		
		
		System.out.print("소요시간:" + (System.currentTimeMillis() - startTime));
	}

}

class Thread3_1 extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i < 300 ; i++)
			System.out.printf("%s", new String("l"));
	}
}
