package com.example.librarymanagement.model;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="libraryuser")
public class LibraryUser {
	@Id
	@SequenceGenerator(name = "LIBUSER_SEQ", sequenceName = "libuser_seq", initialValue = 1, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIBUSER_SEQ")
	private long id;
	private String name;
	private String gender;
	private String email;
	private long phno;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "LibraryUser [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", phno=" + phno
				+ "]";
	}


}
