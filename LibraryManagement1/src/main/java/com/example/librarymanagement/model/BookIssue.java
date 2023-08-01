package com.example.librarymanagement.model;
import org.hibernate.annotations.DynamicUpdate;


import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;










@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@DynamicUpdate
@Table(name="bookIssue")
public class BookIssue {
	@Id	
	@SequenceGenerator(name = "BOOKIS_SEQ",sequenceName = "bookis_seq",
	initialValue = 1, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOKIS_SEQ")
	private long issueId;
	private String status;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-mm-dd")
	private Date issueDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-mm-dd")
	private Date returnWithinDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-mm-dd")
	private Date actualReturnedDate;





	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="BOOK_ID")
	/**
	 * Book_Id is foreign key which references to BOOK_ID Column in Book Entity 
	 */
	private Book book;  

	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="USERID")
	/**
	 * userid is foreign key which references to USERID Column in LibraryUser Entity
	 */
	private LibraryUser libuser;
	//---->column name(foreign key name=DEPTID)

	public long getIssueId() {
		return issueId;
	}

	public void setIssued(long issueId) {
		this.issueId = issueId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getReturnWithinDate() {
		return returnWithinDate;
	}

	public void setReturnWithinDate(Date returnWithinDate) {
		this.returnWithinDate = returnWithinDate;
	}

	public Date getActualReturnedDate() {
		return actualReturnedDate;
	}

	public void setActualReturnedDate(Date actualReturnedDate) {
		this.actualReturnedDate = actualReturnedDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public LibraryUser getLibuser() {
		return libuser;
	}

	public void setLibuser(LibraryUser libuser) {
		this.libuser = libuser;
	}

	@Override
	public String toString() {
		return "BookIssue [issueId=" + issueId + ", status=" + status + ", issueDate=" + issueDate
				+ ", returnWithinDate=" + returnWithinDate + ", actualReturnedDate=" + actualReturnedDate + ", book="
				+ book + ", libuser=" + libuser + "]";
	}





	
	

}
