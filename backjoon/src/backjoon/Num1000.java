package backjoon;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;




public class Num1000 {
	
	public static void main(String[] args) {
		
		try 
			 (FileInputStream fis = new FileInputStream("Num1000.java");
			 DataInputStream dis = new DataInputStream(fis)){
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}	
}
