package com.example.shareThought.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shareThought.model.User;
import com.example.shareThought.repository.UserRepository;
import com.example.shareThought.requestDTO.UserRequestDTO;
import com.example.shareThought.responseDTO.UserResponseDTO;
import com.example.shareThought.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserResponseDTO createUser(UserRequestDTO requestDTO) {
		User user = requestDTO.convertTomodel();
		userRepository.save(user);
		return new UserResponseDTO(user);
	}

	@Override
	public UserResponseDTO editUser(Long userId,UserRequestDTO requestDTO) {
		if(requestDTO.getPassword()!=null) {
			//add Exception
		}
		User user = requestDTO.convertTomodel(userRepository.findById(userId).get());
		userRepository.save(user);
		return new UserResponseDTO(user);
	}

	@Override
	public List<UserResponseDTO> getAll() {
		return userRepository.findAll().stream().map(UserResponseDTO::new).toList();
	}

	@Override
	public UserResponseDTO getById(Long userId) {
		Optional<User> user = userRepository.findById(userId);
		if(user.isEmpty()) {
			//add Exception
		}
		return new UserResponseDTO(user.get());
	}

	@Override
	public List<UserResponseDTO> getAllActive() {
		List<User> users = userRepository.findByIsDelete(false);
		return users.stream().map(UserResponseDTO::new).toList();
	}

	@Override
	public UserResponseDTO deleteById(Long userId) {
		Optional<User> user = userRepository.findById(userId);
		if(user.isEmpty()) {
			//add Exception
		}
		user.get().setIsDelete(true);
		userRepository.save(user.get());
		return new UserResponseDTO(user.get());
	}

}
