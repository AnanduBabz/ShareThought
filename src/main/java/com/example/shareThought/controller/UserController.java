package com.example.shareThought.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shareThought.requestDTO.UserRequestDTO;
import com.example.shareThought.responseDTO.LoginResponseDTO;
import com.example.shareThought.responseDTO.UserResponseDTO;
import com.example.shareThought.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("Login")
	public LoginResponseDTO signIn() {
		return null;
	}

	@PostMapping
	public UserResponseDTO createUser(@RequestBody UserRequestDTO requestDTO) {
		return userService.createUser(requestDTO);	
	}
	
	@PutMapping("/{userId}")
	public UserResponseDTO editUser(@PathVariable Long userId,@RequestBody UserRequestDTO requestDTO) {
		
		return userService.editUser(userId,requestDTO);
	}
	
	@GetMapping("/all")
	public List<UserResponseDTO> getAll(){
		return userService.getAll();
	}
	
	@GetMapping("/active")
	public List<UserResponseDTO> getAllActive(){
		return userService.getAllActive();
	}
	
	@GetMapping("/{userId}")
	public UserResponseDTO getById(@PathVariable Long userId){
		return userService.getById(userId);
	}
	
	@DeleteMapping("/{userId}")
	public UserResponseDTO deleteById(@PathVariable Long userId){
		return userService.deleteById(userId);
	}
	
}
