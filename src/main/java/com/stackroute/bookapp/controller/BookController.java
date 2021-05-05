package com.stackroute.bookapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stackroute.bookapp.model.Book;
import com.stackroute.bookapp.service.BookService;

@Controller
public class BookController {
	
	BookService bookService = new BookService();
	
	@RequestMapping(value="/")
	public String homepage() {
		return "index";
	}
	
	@RequestMapping(value="/getAllBooks",method=RequestMethod.GET)
	public String getAllBooks(Model model) {
		List<Book> booklist = bookService.getAllBooks();
		model.addAttribute("booklist", booklist);
		return "index";
	}
	
	@RequestMapping(value="/addBook",method=RequestMethod.POST)
	public String addBook(Model model) {
		return "index";
	}
	
	@RequestMapping(value="/deleteBook",method=RequestMethod.DELETE)
	public String deleteBook(String bookid) {
		return "index";
	}
	
	@RequestMapping(value="/updateBook",method=RequestMethod.PUT)
	public String updateBook() {
		return "index";
	}
	

}
