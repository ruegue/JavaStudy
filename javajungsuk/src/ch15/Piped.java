package ch15;

import java.io.IOException;
import java.io.PipedReader;
import java.io.StringWriter;

public class Piped {

	public static void main(String[] args) {
		
	}

}

class InputThread extends Thread{
	PipedReader input = new PipedReader();
	StringWriter sw = new StringWriter();
	
	InputThread(String name){
		super(name);
	}
	
	public void run() {
		int data = 0; 
		
		try {
			while((data=input.read())!=-1) {
				sw.write(data);
			}
		} catch (IOException e) {}
		
		System.out.println(getName() + " ," + sw.toString());
	}
}