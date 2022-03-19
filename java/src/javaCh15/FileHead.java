package javaCh15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FileHead {

	public static void main(String[] args)  {
		
		
		
		try {
			FileReader input = new FileReader("src/javaCh15/FileHead.java");
			BufferedReader bufferInput = new BufferedReader(input);
			int j = 1; 
			String line = null;
			
			for(int i = 1 ; i<=j ; i++) {
				System.out.println(bufferInput.readLine());
			}
			
			bufferInput.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
