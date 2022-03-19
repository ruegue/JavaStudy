package ch13;

public class Exercise13_7 implements Runnable{
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t = new Thread(new Exercise13_7());
		t.setDaemon(true);
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5) autoSave = true;
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
		
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);
			}catch(InterruptedException e) {}
		
			if(autoSave) autoSaver();
		}
	}
	
	public void autoSaver() {
		System.out.println("�۾������� �ڵ����� ����Ǿ����ϴ�.");
	}
}



