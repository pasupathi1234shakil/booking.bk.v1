package com.ebook.movie.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebook.movie.Model.AdminModel;
import com.ebook.movie.Repo.AdminRepo;

@Service
public class AdminService {
@Autowired
private AdminRepo adminrepo;
public AdminModel adminData(AdminModel data) {
	return adminrepo.save(data);
}

}
