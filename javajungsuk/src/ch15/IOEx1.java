package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx1 {

	public static void main(String[] args) throws IOException {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
//		System.out.println(Arrays.toString(inSrc));
		
		while(input.available() >0) {
			int len = input.read(temp);
			output.write(temp, 0, len);
			System.out.println("temp:"+Arrays.toString(temp));
			
			outSrc = output.toByteArray();
			System.out.println("outSrc:"+Arrays.toString(outSrc));
			
		}
		

		
	}

}
