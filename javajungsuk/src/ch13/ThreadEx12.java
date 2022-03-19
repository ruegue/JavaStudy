package ch13;

public class ThreadEx12 {
	static long startTime=0;
	
	public static void main(String[] args) {
		ThreadEx12_1 th1 = new ThreadEx12_1();
		ThreadEx12_2 th2 = new ThreadEx12_2();
		th1.start();
		th2.start();
		try {
			th1.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		startTime = System.currentTimeMillis();
		
		try {
			th2.join();
		} catch (InterruptedException e) {}
		
		System.out.print("메인종료" + (System.currentTimeMillis()-startTime));
		
	}
}

class ThreadEx12_1 extends Thread{
	public void run() {
		for(int i=0; i<300 ; i++) {
			System.out.print("-");
		}
		
		System.out.print("종료1");
	}
}

class ThreadEx12_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
		
		System.out.print("종료2");
	}
}

