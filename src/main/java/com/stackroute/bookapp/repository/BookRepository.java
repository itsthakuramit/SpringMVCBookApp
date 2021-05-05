package com.stackroute.bookapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.bookapp.model.Book;

public class BookRepository {

	private List<Book> booklist = new ArrayList<>();
	
	public Book addBook(Book book) {
		booklist.add(book);
		return book;
	}
	
	public List<Book> getAllBooks() {
		return booklist;
	}
	
	public Book deleteBook(String bookid) {
		return null;
	}
	
	public Book updateBook(Book book) {
		
		return null;
	}
	
}
