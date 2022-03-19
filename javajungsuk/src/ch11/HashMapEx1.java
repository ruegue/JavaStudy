package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 pwd를 입력해주세요");
			System.out.print("id :");
			String id = s.nextLine().trim();
			
			System.out.print("pwd: ");
			String pwd = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시입력해주세요");
				continue;
			}
			
			if(!map.get(id).equals(pwd)) {
				System.out.println("비밀번호가 일치하지 않습니다 다시 입력해주세요");
			}else {
				System.out.println("일치합니다");
				break;
			}
		}
		
	}

}
