package com.example.librarymanagement.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.librarymanagement.model.LibraryUser;
import com.example.librarymanagement.repository.LibraryUserRepository;

import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor
public class LibraryUserServiceImpl implements LibraryUserService{
    
   
	LibraryUserRepository libraryUserRepository;

	public LibraryUserServiceImpl(LibraryUserRepository libraryUserRepository) {
		super();
		this.libraryUserRepository = libraryUserRepository;
	}

	@Override
	public List<LibraryUser> getLibraryUsers() {
		// TODO Auto-generated method stub
		return libraryUserRepository.findAll();
	}

	@Override
	public void createLibraryUser(LibraryUser libraryUser) {
		// TODO Auto-generated method stub
		libraryUserRepository.save(libraryUser);
		
	}

	@Override
	public LibraryUser updateLibraryUser(LibraryUser libraryUser) {
		// TODO Auto-generated method stub
		return libraryUserRepository.save(libraryUser);
	}

	@Override
	public void deleteLibraryUserById(long userId) {
		// TODO Auto-generated method stub
	
		 libraryUserRepository.deleteById(userId);
		
		
	}

	@Override
	public LibraryUser getLibraryUserById(int userId) {
		// TODO Auto-generated method stub
		return (LibraryUser) libraryUserRepository.findLibraryuserById(userId);
	}

	@Override
	public LibraryUser getLibraryUserByName(String name) {
		// TODO Auto-generated method stub
		return libraryUserRepository.getLibraryUserByName(name);
	}
    

}
