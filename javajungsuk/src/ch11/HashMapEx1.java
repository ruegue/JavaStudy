package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� pwd�� �Է����ּ���");
			System.out.print("id :");
			String id = s.nextLine().trim();
			
			System.out.print("pwd: ");
			String pwd = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ��Է����ּ���");
				continue;
			}
			
			if(!map.get(id).equals(pwd)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ� �ٽ� �Է����ּ���");
			}else {
				System.out.println("��ġ�մϴ�");
				break;
			}
		}
		
	}

}
