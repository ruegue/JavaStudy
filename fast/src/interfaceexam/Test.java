package interfaceexam;

import java.io.IOException;


public class Test {

	public static void main(String[] args) throws IOException {
		
		System.out.println("��������� �����ϼ���");
		System.out.println("B");
		System.out.println("O");
		System.out.println("Q");
	
		Sort sort = null;
		
		while(true){
	
		int ch = System.in.read();
		System.out.println(ch);
		
		if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
			break;
		}	
		else if(ch == 'B' || ch == 'b'){
			sort = new ButSort();
			break;
		}
		else {
			
			System.out.println("�������� �ʴ� ����Դϴ�");
			continue;
		}
	}
		
	}
}
