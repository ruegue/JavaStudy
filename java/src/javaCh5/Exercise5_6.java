package javaCh5;

import java.util.Scanner;

public class Exercise5_6 {

	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();
			
			int j = (int)(Math.random()*words.length);
			
			char tmp = question[i];
			question[i] = question[j];
			question[j] = tmp;
			
			System.out.printf("Q%d. %s .>�� ������ �Է��ϼ���", i+1, new String(question));
					String answer = scanner.nextLine();
					// trim() answer , equals word[i] ���� �� �¿� ������ ������ �� �� �� ��
					if(words[i].equals(answer.trim()))
					System.out.printf("�¾ҽ��ϴ�. %n%n");
					else
					System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
		}
		
	}

}