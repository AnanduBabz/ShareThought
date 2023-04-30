package com.example.shareThought.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shareThought.model.User;
import com.example.shareThought.responseDTO.UserResponseDTO;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByIsDelete(boolean b);

}
