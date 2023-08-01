package com.example.librarymanagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarymanagement.model.LibraryUser;
import com.example.librarymanagement.service.LibraryUserService;


@RestController

@CrossOrigin(origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE},allowCredentials="false",allowedHeaders="*")
public class LibraryUserController {
	@Autowired
	LibraryUserService libraryUserService;
	
	/**
	 * allUsers() is a method to fetch the list of users from database
	 * @return
	 */
	@GetMapping("/allusers")
	public ResponseEntity<List<LibraryUser>> allUsers(){
		
		
		List<LibraryUser> userList =libraryUserService.getLibraryUsers();
       
		return new ResponseEntity<List<LibraryUser>>(userList,HttpStatus.OK);
	}
	

	/**
	 * createUser(@RequestBody LibraryUser libraryUser) is a method to add users to database
	 * @param libraryUser
	 * @return
	 */
	@PostMapping("/addusers")
	public ResponseEntity<?> createUser(@RequestBody LibraryUser libraryUser) {
		libraryUserService.createLibraryUser(libraryUser);
	        return new ResponseEntity<String>("SAVED SUCCESSFULLY", HttpStatus.CREATED);
	}
	
	/**
	 * updateUser(@RequestBody LibraryUser libraryUser) is a method to update users from database
	 * @param libraryUser
	 * @return
	 */
	@PutMapping("/updateUser")
	public ResponseEntity<?> updateUser(@RequestBody LibraryUser libraryUser){
		
	        LibraryUser updatedUser = libraryUserService.updateLibraryUser(libraryUser);
	        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
		
	}

	/**
	 * deleteUser(@PathVariable("uid") int id) is a method to delete users by userid from database
	 * @param id
	 * @return
	 */
	@DeleteMapping("/deleteUser/{uid}")
	public ResponseEntity<LibraryUser> deleteUser(@PathVariable("uid") int id){
		LibraryUser user=new LibraryUser();
		libraryUserService.deleteLibraryUserById(id);
		
       
		return new ResponseEntity<LibraryUser>(user,HttpStatus.OK);
	}


	/**
	 * userById(@PathVariable("uid") int id)  is a method to fetch user by userid from database
	 * @param id
	 * @return
	 */
	@GetMapping("/userById/{uid}")
	public ResponseEntity<LibraryUser> userById(@PathVariable("uid") int id){
		LibraryUser user=libraryUserService.getLibraryUserById(id);
		//System.out.println(emp);
	//	if(emp.isEmpty()) {
			//return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
		//}
		return new ResponseEntity<LibraryUser>(user,HttpStatus.OK);
	}
	
	/**
	 * userByName(@PathVariable("uname") String name)  is a method to fetch user by name from database
	 * @param name
	 * @return
	 */
	@GetMapping("/userByName/{uname}")
	public ResponseEntity<LibraryUser> userByName(@PathVariable("uname") String name){
		LibraryUser user=libraryUserService.getLibraryUserByName(name);
		//System.out.println(emp);
	//	if(emp.isEmpty()) {
			//return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
		//}
		return new ResponseEntity<LibraryUser>(user,HttpStatus.OK);
	}	
	

}
