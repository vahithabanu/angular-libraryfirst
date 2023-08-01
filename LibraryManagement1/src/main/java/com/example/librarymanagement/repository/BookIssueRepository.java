package com.example.librarymanagement.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.librarymanagement.model.BookIssue;


public interface BookIssueRepository extends JpaRepository<BookIssue, Long>{
	
	public BookIssue getBookIssueByIssueId(long bissue_Id);
	
	

}
