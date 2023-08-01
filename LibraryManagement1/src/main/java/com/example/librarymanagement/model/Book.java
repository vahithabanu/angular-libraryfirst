package com.example.librarymanagement.model;


import java.util.Date;


import java.sql.Timestamp;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="BOOKTABLE")
public class Book {
	@Id
	@SequenceGenerator(name = "BOOK_SEQ",sequenceName = "book_seq",
	initialValue = 1, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOK_SEQ")
	private long bookId;
	@Column	
	private String title;
	@Column	
	private String author;
	@Column	
	private String category;
	@Column	
	private String publication;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-mm-dd")
	@Column	
	private Date publish_Date;
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public Date getPublish_Date() {
		return publish_Date;
	}
	public void setPublish_Date(Date publish_Date) {
		this.publish_Date = publish_Date;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", publication=" + publication + ", publish_Date=" + publish_Date + "]";
	}







	}

