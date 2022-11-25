package com.codingdojo.mvc.controllers;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/")
	public String homepage(Model model) {
		return "redirect:/books";
	}
	
	
	@GetMapping("/books")
	    public String index(Model model) {
	        List<Book> books = bookService.allBooks();
	        model.addAttribute("books", books);
	        return "index.jsp";
	    }
	

	@GetMapping("books/{bookId}")
	public String show(Model model,@PathVariable("bookId") Long id) {
		System.out.println(id);
		Book book = bookService.findBook(id);
		System.out.println(book);
		model.addAttribute("book",book);
		return "show.jsp";
	}
	
	@GetMapping("/books/new")
	public String newbook(@ModelAttribute("book") Book book ) {
		return "new.jsp";
	}
	
	@PostMapping("/books")
	public String create(
//	    @RequestParam("title") String title,
//	    @RequestParam("description") String description,
//	    @RequestParam("language") String language,
//	    @RequestParam("pages") Integer pages) 
		@Valid @ModelAttribute("book") Book book,
		BindingResult result)
	{
		if (result.hasErrors()) {
			return "new.jsp";
		} else {
	    // CODE TO MAKE A NEW BOOK AND SAVE TO THE DB
//	    Book book = new Book(title, description, language, pages);
	    bookService.createBook(book);
	    return "redirect:/books";
		}
	
	}
}
