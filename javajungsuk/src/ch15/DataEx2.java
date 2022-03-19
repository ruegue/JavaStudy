package ch15;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataEx2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("src/ch15/123.txt");
		DataInputStream dis =  new DataInputStream(fis);
		
		System.out.println(dis.readInt());	
	}

}
