package com.madhushika.memento;

public class Application {

	public static  void main(String[]args) {
		
		CareTaker careTaker = new CareTaker();
		Book book = new Book();
		book.addEditor(new Editor("Dan Brown"));
		careTaker.save(book);
		System.out.println(book);
		book.addEditor(new Editor("arthur conan doyle"));
		careTaker.save(book);
		System.out.println(book);
		book.addEditor(new Editor("JK Rowling"));
		careTaker.save(book);
		System.out.println(book);
		careTaker.revert(book);
		System.out.println(book);
		careTaker.revert(book);
		System.out.println(book);	
		careTaker.revert(book);
		System.out.println(book);
		careTaker.revert(book);
		System.out.println(book);
		careTaker.revert(book);
		System.out.println(book);
		
		
		
	}
	

	
}
