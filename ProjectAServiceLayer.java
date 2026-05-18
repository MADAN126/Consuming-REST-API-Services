package com.ProjectA.main.ServiceLayer;

import java.net.http.HttpHeaders;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ProjectA.main.DTO.UserDTO;

@Service
public class ServiceLayer {

	public ResponseEntity<UserDTO> verifyUser(UserDTO userdto) {
		if (userdto != null) {
			org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
			headers.add("Security", "10010323fererweqe");
			return new ResponseEntity<UserDTO>(userdto, headers, HttpStatusCode.valueOf(200));
		} else {
			return new ResponseEntity<UserDTO>(userdto, HttpStatusCode.valueOf(404));
		}
	}

}
