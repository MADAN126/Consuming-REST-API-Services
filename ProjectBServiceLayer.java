package com.ProjectB.main.ServiceLayer;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {

	public ResponseEntity<UserDTO> callService() {
		RestTemplate temp = new RestTemplate();
		UserDTO user = new UserDTO();
		user.setEmail("sneha@gmail.com");
		user.setPassword("sneha2004");
		String url = "http://localhost:9001/user/create";
		ResponseEntity<UserDTO> user1 = temp.postForEntity(url, user, UserDTO.class);
		System.out.println("Project B calls Project A");
		return user1;
	}
}
