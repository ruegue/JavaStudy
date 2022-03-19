package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex15_1 {

	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outStrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data =0;
		
		while((data = input.read())!=-1) {
			System.out.println(data);
			output.write(data);
		}
		
		outStrc = output.toByteArray();
		
		System.out.println(Arrays.toString(inSrc));
		System.out.println(data);
	}

}
