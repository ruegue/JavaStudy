package ch4;

import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int) (Math.random()*100) +1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �õ��� ���ÿ�");
			}else if(input < answer){
				System.out.println("�� ū ���� �ٽ� �õ��غ��ÿ�");
			}
		}while(input!=answer);
		
		System.out.println("�����Դϴ�.");
	}

}
