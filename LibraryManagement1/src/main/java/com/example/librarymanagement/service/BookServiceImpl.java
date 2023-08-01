package com.example.librarymanagement.service;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.librarymanagement.model.Book;
import com.example.librarymanagement.repository.BookRepository;


@Service
@Component
public class BookServiceImpl implements BookService{
	
	
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}



	BookRepository bookRepository;

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println("book obj"+book);
		return bookRepository.save(book);
	}

	@Override
	public Book getBookById(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.getById(id);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public void deleteBookById(Long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}

	

	@Override
	public Book getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return bookRepository.getBookByTitle(title);
	}


}
