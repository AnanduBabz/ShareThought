package com.example.shareThought.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shareThought.model.Thoughts;
import com.example.shareThought.responseDTO.ThoughtResponseDTO;

@Repository
public interface ThoughtRepository extends JpaRepository<Thoughts, Long>{

	List<Thoughts> findByUserId(Long userId);

}
