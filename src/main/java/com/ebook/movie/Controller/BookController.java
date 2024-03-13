package com.ebook.movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebook.movie.Model.BookModel;
import com.ebook.movie.Service.BookService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:3000")
public class BookController {
	@Autowired 	
	private BookService bookservice;
	
	@PostMapping("/register")
	public ResponseEntity<?>registerUser(@RequestBody BookModel user){
	bookservice.registerUser(user);
		return ResponseEntity.status(HttpStatus.OK).body(user);
		
	}

}
