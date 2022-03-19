package ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		
		int data = 0; 
		
		data=fis.read();
		fos.write(data);
		
		fis.close();
		fos.close();
	}

}
