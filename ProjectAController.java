package com.ProjectA.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectA.main.DTO.UserDTO;
import com.ProjectA.main.ServiceLayer.ServiceLayer;

@RestController
public class Controller {

	@Autowired
	ServiceLayer service;

	@PostMapping("/user/create")
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userdto) {
		ResponseEntity<UserDTO> res = service.verifyUser(userdto);
		return res;
	}

}
