package com.stackroute.bookapp.service;

import java.util.List;

import com.stackroute.bookapp.model.Book;
import com.stackroute.bookapp.repository.BookRepository;

public class BookService {

	BookRepository bookRepository = new BookRepository();
	
	public Book addBook(Book book) {
		Book addedBook = bookRepository.addBook(book);
		return addedBook;
	}
	
	public List<Book> getAllBooks() {
		return bookRepository.getAllBooks();
	}
	
	public Book deleteBook(String bookid) {
		return bookRepository.deleteBook(bookid);
	}
	
	public Book updateBook(Book book) {
		return bookRepository.updateBook(book);
	}
	
}
