package ch13;

import javax.swing.JOptionPane;

public class EX13_9 {

	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ����"+ input + "�Դϴ�.");
		th1.interrupt();
		System.out.println(th1.isInterrupted());
		
	}

}

class ThreadEx9_1 extends Thread{
	public void run() {
		int i= 10;
		
		while (i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<2500000000L; x++);
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}
