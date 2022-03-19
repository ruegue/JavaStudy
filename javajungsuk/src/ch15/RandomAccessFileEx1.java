package ch15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx1 {

	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile("test.dat","rw");
			System.out.println("파일 포인터 위치:" + raf.getFilePointer());
			raf.writeInt(100);
			System.out.println("파일포인터 위치:"+ raf.getFilePointer());
			raf.writeLong(100L);
			System.out.println("파일포인터 위치:" + raf.getFilePointer());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
