package com.example.shareThought.service;

import java.util.List;

import com.example.shareThought.requestDTO.ThoughtsRequestDTO;
import com.example.shareThought.responseDTO.ThoughtResponseDTO;

public interface ThoughtService {

	List<ThoughtResponseDTO> getAll();

	List<ThoughtResponseDTO> getAllbyUser(Long userId);

	ThoughtResponseDTO getTought(Long thoughtId);

	ThoughtResponseDTO createThought(ThoughtsRequestDTO requestDTO);

	ThoughtResponseDTO updateThought(Long thoughtId, ThoughtsRequestDTO requestDTO);

	ThoughtResponseDTO deleteThought(Long thoughtId);

}
