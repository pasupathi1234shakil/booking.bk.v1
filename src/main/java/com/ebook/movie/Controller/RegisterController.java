package com.ebook.movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebook.movie.Model.AdminModel;
import com.ebook.movie.Model.RegisterModel;
import com.ebook.movie.Service.RegisterService;

@RestController
@RequestMapping("register")
@CrossOrigin(origins="http://localhost:3000")
public class RegisterController {
@Autowired
private RegisterService registerService;

@PostMapping("/registerdata")
public ResponseEntity<?>registerData(@RequestBody RegisterModel data){
	RegisterModel shakil=registerService.registerData(data);
	return ResponseEntity.status(HttpStatus.OK).body(shakil);
}

}
