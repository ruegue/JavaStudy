package test;

import java.util.ArrayList;

public class Student {

	String studentName;
	ArrayList<Book> bookList;
	
	
	Student(String studentName){
		this.studentName = studentName;
		
		bookList = new ArrayList<Book>();
		
		
	}
	
	
	public void addBook(String title) {
		Book book = new Book();
		
		book.setBookName(title);
		bookList.add(book);
		
	}
	
	
	public void showInfo() {
		System.out.print(studentName + "학생이 읽은 책은");
		
		for(Book book : bookList){
			System.out.print(book.getBookName()+ ","+ " ");
		}
		System.out.println("입니다.");
	}
	
}
