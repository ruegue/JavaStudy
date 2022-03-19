package ch15;

import java.io.*;

public class Ex15_16 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("���丮�� �ʿ�");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ�������� ���丮�Դϴ�.");
			System.exit(0);
		}
		
		
		File[] files = f.listFiles();
		
		for(int i=0; i< files.length; i++) {
			String name = files[i].getName();
			System.out.println(files[i].isDirectory() ? "["+ name +"]" : name); 
		}
	}

}
