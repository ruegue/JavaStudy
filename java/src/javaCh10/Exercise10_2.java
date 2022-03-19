package javaCh10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_2 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);
		Scanner scanner = new Scanner(System.in);
		
		Date inDate = null;
		
		while(true) {
			System.out.println("��¥�� yyyy/MM/dd�� ���·� �Է����ּ���");
			String tmp = scanner.nextLine();
			try {
				inDate = sdf1.parse(tmp);
				break;
			}catch(Exception e) {
				continue;
			}
			
		}
		SimpleDateFormat sdf2 = new SimpleDateFormat("�Է��Ͻ� ��¥�� E�����Դϴ�.");
		System.out.println(sdf2.format(inDate));
		
		
	}

}
