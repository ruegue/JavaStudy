package javaCh15;

import java.io.*;
import java.util.Vector;

public class Exercise15_3 {

	public static void main(String[] args) {
		
		
		try{
		
		Vector v = new Vector();
	
		for(int i=1; i<args.length; i++) {
			File f = new File(args[i]);
			
			if(f.exists()) {
				v.add(new FileInputStream(args[i]));
			}else {
				System.out.println(args[i] +"-�������� �ʴ� �����Դϴ�.");
				System.exit(0);
			}
		}
			
			SequenceInputStream input = new SequenceInputStream(v.elements());
			FileOutputStream output = new FileOutputStream(args[0]);
			
			int data = 0;
			
			while((data = input.read()) !=-1) {
				output.write(data);
			}
		
		}catch(IOException e) {}
	}

}
