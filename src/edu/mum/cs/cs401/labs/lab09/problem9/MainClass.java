package edu.mum.cs.cs401.labs.lab09.problem9;

import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Book book = new Book("test", 3);
		List<BookCopy> copies = book.getCopies();
		copies.forEach(copy -> copy.changeAvailability());
		//copies.get(1).changeAvailability();
		System.out.println(book.isAvailable());
	}

}
