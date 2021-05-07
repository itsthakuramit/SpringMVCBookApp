package com.stackroute.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.bookapp.model.Book;
import com.stackroute.bookapp.repository.BookRepository;


@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
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
	
	public Book getBookById(String bookid) {
		return bookRepository.getBookById(bookid);
	}
}
