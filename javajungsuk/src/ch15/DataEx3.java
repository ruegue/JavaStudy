package ch15;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataEx3 {

	public static void main(String[] args) throws Exception {
		int [] score = {100, 90, 95, 85, 50};
		
		FileOutputStream fos = new FileOutputStream("src/ch15/score.txt");
		DataOutputStream dos =  new DataOutputStream(fos);
		
		for(int i=0; i< score.length ; i++) {
			dos.writeInt(score[i]);
		}
		
		dos.close();
	}

}
