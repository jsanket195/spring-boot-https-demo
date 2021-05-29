package com.sanky.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

	@GetMapping("/users")
	public ResponseEntity<Map<String, Integer>> getUsers() {

		Map<String, Integer> users = new HashMap<String, Integer>();
		users.put("Sanket", 123456789);

		return new ResponseEntity<Map<String, Integer>>(users, HttpStatus.OK);

	}
}
