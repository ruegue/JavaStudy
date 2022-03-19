package ch15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Ex15_9 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("src/ch15/Ex15_9.java");
			FileWriter fw = new FileWriter("src/123");
			
			int data = 0;
			
			while((data=fr.read())!=-1) {
				if(data!='\t' && data!='\n' && data!=' ' && data != '\r')
					fw.write(data);
			}
			
			fr.close();
			fw.close();
			
		}catch(IOException e) {}
}
}
