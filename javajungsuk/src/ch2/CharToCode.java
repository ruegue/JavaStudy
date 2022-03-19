package ch2;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A';
		int code = (int)ch;
		
		System.out.printf("%c = %d%n", ch, code);
		
		char hch = '°¡'; 
		System.out.printf("%c = %d%n", hch, (int)hch);
		
	}

}
