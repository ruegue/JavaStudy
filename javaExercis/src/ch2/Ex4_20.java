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
			System.out.println("원하는메뉴를 선택하세요(종료:0)>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else if(menu<1 || menu >3) {
				System.out.println("메뉴를 잘못선택하셨습니다.");
				continue;
			}
			for(;;) {
				System.out.println("계산할 값을 입력하세요.(계산종료0, 시스템종료)99");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num== 0) {
					System.out.println("계산을 종료합니다.");
					break ;
				}else if(num == 99) {
					System.out.println("시스템을 종료합니다.");
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

