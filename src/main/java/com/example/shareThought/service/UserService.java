package com.example.shareThought.service;

import java.util.List;

import com.example.shareThought.requestDTO.UserRequestDTO;
import com.example.shareThought.responseDTO.UserResponseDTO;

public interface UserService {

	UserResponseDTO createUser(UserRequestDTO requestDTO);

	UserResponseDTO editUser(Long userId, UserRequestDTO requestDTO);

	List<UserResponseDTO> getAll();

	UserResponseDTO getById(Long userId);

	List<UserResponseDTO> getAllActive();

	UserResponseDTO deleteById(Long userId);

}
