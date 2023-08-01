package com.example.librarymanagement.service;
import java.util.List;


import com.example.librarymanagement.model.Book;


public interface BookService {
List<Book> getAllBooks();
	
    public Book saveBook(Book book);
	
    Book getBookById(Long id);
	
    Book updateBook(Book book);
	
	void deleteBookById(Long id);
	
	Book getBookByTitle(String title);
	

}
