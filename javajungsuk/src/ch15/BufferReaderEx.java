package ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderEx {

	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("src/ch15/BufferReaderEx.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			
			for(int i=1; (line = br.readLine()) !=null ; i++) {
				if(line.indexOf(";")!=-1) {
					System.out.println(i+":"+line);
				}
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
