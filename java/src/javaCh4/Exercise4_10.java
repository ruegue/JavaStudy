package javaCh4;

import java.util.Scanner;

public class Exercise4_10 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ���:");
			input = scanner.nextInt();
			
			if(input<answer) {
				System.out.println("�� ū ���� �Է��ϼ���");
				continue;
			}else if(input>answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
				continue;
			}else if(input == answer) {
				System.out.println("�������ϴ�.");
				System.out.println("�õ� Ƚ����"+count+"�� �Դϴ�.");
				break;
			}
			
		}while(true);
	}

}
