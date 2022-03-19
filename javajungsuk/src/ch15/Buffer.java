package ch15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Buffer {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("src/ch15/123.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos,5);
		
		for(int i='1'; i <= '9' ; i++) {
			bos.write(i);
		}
		
		bos.close();
	}

}
