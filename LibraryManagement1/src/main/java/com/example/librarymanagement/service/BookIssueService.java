package com.example.librarymanagement.service;

import java.util.List;


import com.example.librarymanagement.model.BookIssue;

public interface BookIssueService {
public List<BookIssue> getBookIssueList();
	
	public void createBookIssue(BookIssue bookIssue);
	public BookIssue updateBookIssue(BookIssue bookIssue);
	public void deleteBookIssue(long bissue_Id);
	public BookIssue getBookIssueByIssueId(int bissue_Id);
	public List<BookIssue> getBookIssuebyuid();
	public BookIssue updateBookReturn(BookIssue bookIssue);
}
