package com.ebook.movie.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebook.movie.Model.RegisterModel;

public interface RegisterRepo extends JpaRepository<RegisterModel, Integer>{

}
