package com.ebook.movie.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebook.movie.Model.RegisterModel;
import com.ebook.movie.Repo.RegisterRepo;

@Service
public class RegisterService {
@Autowired
private RegisterRepo registerrepo;
public RegisterModel registerData(RegisterModel data) {
	return registerrepo.save(data);
}
}
