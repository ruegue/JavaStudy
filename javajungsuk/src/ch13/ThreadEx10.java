package ch13;

public class ThreadEx10 implements Runnable {
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadEx10());
		t.setDaemon(true);
		t.start();
		
		for(int i=1; i <=8; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(i);
			if(i==5) 
				autoSave=true;
		}
		
		System.out.println("�ý����� �����մϴ�.");
		
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {}
		if(autoSave) {
			autoSave();
		}
	}
	}
	
	public void autoSave() {
		System.out.println("�۾������� �ڵ�����Ǿ����ϴ�");
	}

}