package com.example.librarymanagement.service;

import java.util.List;


import com.example.librarymanagement.model.LibraryUser;

public interface LibraryUserService {
public List<LibraryUser> getLibraryUsers();
	
	public void createLibraryUser(LibraryUser libraryUser);
	public LibraryUser updateLibraryUser(LibraryUser libraryUser);
	public void deleteLibraryUserById(long userId);
	public LibraryUser getLibraryUserById(int userId);
	public LibraryUser getLibraryUserByName(String name);
}
