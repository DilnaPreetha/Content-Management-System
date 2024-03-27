package com.example.cms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cms.dto.UserRequest;
import com.example.cms.dto.UserResponse;

import com.example.cms.service.UserService;
import com.example.cms.utility.ResponseStructure;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
@RestController
@AllArgsConstructor
public class UserController {
	private UserService userService;
	
	
	
//	
//	@Operation(description = "The endpoint is used to add a new user to the database",responses= {
//			@ApiResponse(responseCode = "200",description = "User registered  successFully"),
//			@ApiResponse(responseCode = "400",description = "Invalid inputs")
//	})

	@PostMapping("/users/register")
	public ResponseEntity<ResponseStructure<UserResponse>> userRegistration(@RequestBody UserRequest userRequest)
	{
		return userService.userRegistration(userRequest);

}
	@GetMapping("test")
	public String test() {
		return "hello from cms";
	}
}