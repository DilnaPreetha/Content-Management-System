package com.example.cms.serviceImpl;




import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.cms.dto.UserRequest;
import com.example.cms.dto.UserResponse;
import com.example.cms.entity.User;
import com.example.cms.exception.UserAlreadyExistByEmailException;
import com.example.cms.repository.UserRepository;
import com.example.cms.service.UserService;
import com.example.cms.utility.ResponseStructure;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;




@Service
public  class UserServiceImpl implements UserService {
	private UserRepository userRepo;
	private ResponseStructure<UserResponse> responseStructure;
	private PasswordEncoder passwordEncoder;
	
	
	

	@Override
	public ResponseEntity<ResponseStructure<UserResponse>>  userRegistration(UserRequest userRequest) {
//		if(userRepo.existsByEmail(userRequest.getEmail()))
//			throw new UserAlreadyExistByEmailException("failed to register user");
		
		User uniqueUser=userRepo.save(mapToUserEntity(userRequest,new User()));
		return ResponseEntity.ok(responseStructure.setStatuscode(HttpStatus.OK.value())
				.setMessage("User registered successfully")
				.setData(mapToUserResponse(uniqueUser)));
		
	}


	public User mapToUserEntity(UserRequest userRequest, User user) {
		user.setUsername(userRequest.getUsername());
		user.setEmail(userRequest.getEmail());
		user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
		return user;
		
		
	}


	public UserResponse mapToUserResponse(User user) {
		UserResponse userResponse=new UserResponse();
		userResponse.setUserId(user.getUserid());
		userResponse.setUserName(user.getUsername());
		userResponse.setEmail(user.getEmail());
		userResponse.setCreatedAt(user.getCreateAt());
		userResponse.setLastmodifiedAt(user.getLastmodifiedAt());
		return userResponse;
	}


	public UserServiceImpl(UserRepository userRepo, ResponseStructure<UserResponse> responseStructure,
			PasswordEncoder passwordEncoder) {
		super();
		this.userRepo = userRepo;
		this.responseStructure = responseStructure;
		this.passwordEncoder = passwordEncoder;
	}

}




	
	



	
	



	


