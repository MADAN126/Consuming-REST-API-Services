package com.ProjectB.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectB.main.ServiceLayer.ServiceLayer;
import com.ProjectB.main.ServiceLayer.UserDTO;

@RestController
public class Controller {

	@Autowired
	ServiceLayer service;
	
	@GetMapping("/call/service")
	public ResponseEntity<UserDTO> getService(){
		return service.callService();
	}
}
