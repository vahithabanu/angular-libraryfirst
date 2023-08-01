package com.example.librarymanagement.service;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.librarymanagement.model.BookIssue;
import com.example.librarymanagement.repository.BookIssueRepository;

import lombok.AllArgsConstructor;






@Service
public class BookIssueServiceImpl implements BookIssueService{	
	

	@Autowired
	BookIssueRepository bookIssueRepository;

	@Override
	public List<BookIssue> getBookIssueList() {
		// TODO Auto-generated method stub
		return bookIssueRepository.findAll();
	}

	

	@Override
	public void createBookIssue(BookIssue bookIssue) {
		// TODO Auto-generated method stub
		bookIssueRepository.save(bookIssue);
	}

	@Override
	public BookIssue updateBookIssue(BookIssue bookIssue) {
		// TODO Auto-generated method stub
		return bookIssueRepository.save(bookIssue);
	}

	@Override
	public void deleteBookIssue(long bissue_Id) {
		// TODO Auto-generated method stub
		 bookIssueRepository.deleteById( bissue_Id);
	}

	@Override
	public BookIssue getBookIssueByIssueId(int bissue_Id) {
		// TODO Auto-generated method stub
		return bookIssueRepository.getBookIssueByIssueId(bissue_Id);
	}

	@Override
	public List<BookIssue> getBookIssuebyuid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookIssue updateBookReturn(BookIssue bookIssue) {
		
		
		// TODO Auto-generated method stub
		System.out.println("book issue"+bookIssue);
		BookIssue bi=new BookIssue();
		bi=bookIssueRepository.getBookIssueByIssueId(bookIssue.getIssueId());
		bookIssue.setIssueDate(bi.getIssueDate());
		bookIssue.setReturnWithinDate(bi.getReturnWithinDate());
		System.out.println("book issue"+bi);
		return  bookIssueRepository.save(bookIssue);
	}

}
