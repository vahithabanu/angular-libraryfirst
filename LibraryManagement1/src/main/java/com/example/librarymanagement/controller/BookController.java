package com.example.librarymanagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarymanagement.model.Book;
import com.example.librarymanagement.service.BookService;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "http://localhost:4200", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE }, allowCredentials = "false", allowedHeaders = "*")
public class BookController {
	@Autowired
	BookService bookService;

	// private static final Logger
	// logger=Logger.getLogger("EmployeeRestController.class");

	@GetMapping("/allbooks")
	public ResponseEntity<List<Book>> getAllUsers() {
		List<Book> users = bookService.getAllBooks();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@GetMapping("/bookById/{bid}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") Long bookId) {
		Book book = bookService.getBookById(bookId);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}

	@PostMapping("/createbook")
	public ResponseEntity<Book> createBook(@RequestBody Book book) {
		Book savedBook = bookService.saveBook(book);
		return new ResponseEntity<Book>(savedBook, HttpStatus.CREATED);
	}

	@PutMapping("/updatebook")
	// http://localhost:8080/api/users/1
	public ResponseEntity<Book> updateUser(@RequestBody Book book) {

		Book updatedBook = bookService.updateBook(book);
		return new ResponseEntity<>(updatedBook, HttpStatus.OK);
	}

	@DeleteMapping("/deletebook/{bid}")
	public ResponseEntity<String> deleteBook(@PathVariable("bid") Long bookId) {
		bookService.deleteBookById(bookId);
		return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
	}
	@GetMapping("/bookByTitle/{bTitle}")
	public ResponseEntity<Book> bookByTitle(@PathVariable("bTitle") String bname){
		Book book=bookService.getBookByTitle(bname);
		//System.out.println(emp);
	//	if(emp.isEmpty()) {
			//return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
		//}
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}	
	

}
