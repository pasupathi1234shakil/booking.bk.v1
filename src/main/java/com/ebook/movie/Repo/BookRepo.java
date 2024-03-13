package com.ebook.movie.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebook.movie.Model.BookModel;

@Repository
public interface BookRepo extends JpaRepository<BookModel, Integer> {
	BookModel findByUsername(String username);
	

}
