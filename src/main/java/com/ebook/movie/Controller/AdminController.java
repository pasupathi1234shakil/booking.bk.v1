package com.ebook.movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebook.movie.Model.AdminModel;
import com.ebook.movie.Service.AdminService;

@RestController
@RequestMapping("admin")
@CrossOrigin(origins="http://localhost:3000")
public class AdminController {
@Autowired
private AdminService adminService;


@PostMapping("/admindata")
public ResponseEntity<?>adminData(@RequestBody AdminModel data){
	AdminModel shakil=adminService.adminData(data);
	return ResponseEntity.status(HttpStatus.OK).body(shakil);
}
}
