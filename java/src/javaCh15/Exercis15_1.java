package javaCh15;

import java.io.*;


public class Exercis15_1 {

	public static void main(String[] args) {
		
		try {
		
		File fis = new File(args[0]);
		BufferedReader bis = new BufferedReader(new FileReader(fis));
		
		int line = Integer.parseInt("8");
		
	
		for(int i =0; i< line ; i++) {
			System.out.print(i+1+":");
			System.out.println(bis.readLine());
		}
		
		bis.close();
		
		}catch(IOException e) {}
	}

}
