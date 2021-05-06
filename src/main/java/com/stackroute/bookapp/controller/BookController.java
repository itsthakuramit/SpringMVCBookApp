package com.stackroute.bookapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.bookapp.model.Book;
import com.stackroute.bookapp.service.BookService;

@Controller
public class BookController {

	BookService bookService = new BookService();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAllBooks(Model model) {
		List<Book> booklist = bookService.getAllBooks();
		model.addAttribute("booklist", booklist);
		return "index";
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String addBook(Model model, @RequestParam("bookid") String bookid, @RequestParam("bookname") String bookname,
			@RequestParam("author") String author) {

		Book newbook = new Book();
		newbook.setBookid(bookid);
		newbook.setBookname(bookname);
		newbook.setAuthor(author);

		bookService.addBook(newbook);

		return "redirect:/";
	}

	@RequestMapping(value = "/deleteBook", method = RequestMethod.GET)
	public String deleteBook(@RequestParam String bookid) {
		bookService.deleteBook(bookid);
		return "redirect:/";

	}

	@RequestMapping(value = "/updateBook")
	public String updateBook(Model model, @RequestParam String bookid) {
		Book book = bookService.getBookById(bookid);
		model.addAttribute("book", book);
		return "update";
	}

	@RequestMapping(value = "/updateSave")
	public String updateSave(@ModelAttribute("book") Book book) {
		bookService.updateBook(book);
		return "redirect:/";
	}

}
