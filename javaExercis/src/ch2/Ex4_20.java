package ch2;

import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square boot");
			System.out.println("(3) log");
			System.out.println("���ϴ¸޴��� �����ϼ���(����:0)>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}else if(menu<1 || menu >3) {
				System.out.println("�޴��� �߸������ϼ̽��ϴ�.");
				continue;
			}
			for(;;) {
				System.out.println("����� ���� �Է��ϼ���.(�������0, �ý�������)99");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num== 0) {
					System.out.println("����� �����մϴ�.");
					break ;
				}else if(num == 99) {
					System.out.println("�ý����� �����մϴ�.");
					break outer;
				}
				
				
				switch(menu){
				case 1:
					System.out.println(num*num);
					break;
				case 2:
					System.out.println(Math.sqrt(num));
					break;
				case 3:
					System.out.println(Math.log(num));
					break;
				}
				
				
			}
		}
	}
}	

