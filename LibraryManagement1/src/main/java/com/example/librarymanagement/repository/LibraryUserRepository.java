package com.example.librarymanagement.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.librarymanagement.model.LibraryUser;

public interface LibraryUserRepository extends JpaRepository<LibraryUser,Long>{
	
	List<LibraryUser> findLibraryuserById(long id);

	LibraryUser getLibraryUserByName(String name);

}
