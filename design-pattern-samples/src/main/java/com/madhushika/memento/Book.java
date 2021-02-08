package com.virtusa.memento;

import java.util.ArrayList;

public class Book {

	ArrayList<Editor> editors = new ArrayList<>();

	public void addEditor(Editor editor) {
		editors.add(editor);
	}

	public ArrayList<Editor> getEditors() {
		 return (ArrayList<Editor>)editors.clone();
	}

	public BookMemento save() {
		return new BookMemento(getEditors());

	}

	public void revert(BookMemento bookMemento) {
		editors= bookMemento.getEditors();
	}
	@Override
	public String toString() {
		return "Book [editors=" + editors + "]";
	}

	static class BookMemento {
		ArrayList<Editor> editors;

		public BookMemento(ArrayList<Editor> editors) {
			this.editors = editors;
		}

		private ArrayList<Editor> getEditors() {
			return editors;
		}

	}

}
