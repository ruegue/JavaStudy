package ch15;

import java.io.*;

public class Ex15_17 {
	
	static int deletedFiles = 0;
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("���� ��� ������");
			System.exit(0);
		}
		
		String currDir = System.getProperty("user.dir");
		
		File dir = new File(currDir);
		String ext = "."+ args[0];
		
		delete(dir, ext);
		System.out.println(deletedFiles + "���� ������ �����Ǿ����ϴ�");
	}
	
	public static void delete(File dir, String ext) {
		File[] files = dir.listFiles();
		
		
		for(int i=0; i< files.length; i++) {
			if(files[i].isDirectory()) {
				delete(files[i], ext);
			}
		}
	}

}
