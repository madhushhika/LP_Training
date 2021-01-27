package com.virtusa.memento;

import java.util.Stack;

public class CareTaker { // lifo

	Stack<Book.BookMemento> history = new Stack<>();
	public void save(Book book) {
		history.push(book.save());
		
	}
	public void revert(Book book) {
		if (!history.isEmpty())
			book.revert(history.pop());
		else 
			System.out.println("Cannot undo ");
		
	}
}
