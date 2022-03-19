package ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileEx1 {

	public static void main(String[] args) throws Exception {
		String fileName = "src/ch15/sample.txt";
		FileInputStream fis = new FileInputStream(fileName);
		FileReader fr = new FileReader(fileName);
		
		int data = 0;
		
		while((data=fis.read())!=-1) {
			System.out.print((char)data);
		}
		
		System.out.println();
		fis.close();
		
		while((data = fr.read())!=-1) {
			System.out.print((char)data);
		}
		
		fr.close();
	}

}
