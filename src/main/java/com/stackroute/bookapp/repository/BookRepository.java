package com.stackroute.bookapp.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
		Book deletedBook = new Book();
		Book book;
		ListIterator<Book> list = booklist.listIterator();
		while (list.hasNext()) {
			if ((book = list.next()).getBookid().equals(bookid)) {
				list.remove();
				deletedBook = book;
			}
		}
		return deletedBook;
	}

	public Book updateBook(Book book) {
		ListIterator<Book> list = booklist.listIterator();
		String bookid = book.getBookid();
		while (list.hasNext()) {
			if ((list.next()).getBookid().equals(bookid)) {
				list.remove();
				list.add(book);
			}
		}
		return book;
	}

	public Book getBookById(String bookid) {
		Book bookMatch = new Book();
		Book book;
		ListIterator<Book> list = booklist.listIterator();
		while (list.hasNext()) {
			if ((book = list.next()).getBookid().equals(bookid)) {
				bookMatch = book;
			}
		}
		return bookMatch;
	}

}
