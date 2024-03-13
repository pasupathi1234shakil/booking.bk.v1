package com.ebook.movie.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebook.movie.Model.BookModel;
import com.ebook.movie.Repo.BookRepo;

@Service
public class BookService {
	@Autowired
	private BookRepo bookrepo;
	public BookModel registerUser(BookModel user) {
		
		if(bookrepo.findByUsername(user.getUsername())!=null) {
			throw new RuntimeException("Username already exists");
		}
		return bookrepo.save(user);
	}
    public BookModel getUserByUsername(String username) {
    	return bookrepo.findByUsername(username); 
    	}
}
