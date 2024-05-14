package com.ebook.movie.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebook.movie.Model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, Integer>{

}
