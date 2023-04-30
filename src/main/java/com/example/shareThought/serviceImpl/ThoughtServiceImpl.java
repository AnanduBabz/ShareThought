package com.example.shareThought.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shareThought.model.Thoughts;
import com.example.shareThought.repository.ThoughtRepository;
import com.example.shareThought.requestDTO.ThoughtsRequestDTO;
import com.example.shareThought.responseDTO.ThoughtResponseDTO;
import com.example.shareThought.service.ThoughtService;

@Service
public class ThoughtServiceImpl implements ThoughtService{
	
	@Autowired
	ThoughtRepository thoughtRepo;

	@Override
	public List<ThoughtResponseDTO> getAll() {
		return thoughtRepo.findAll().stream().map(ThoughtResponseDTO::new).toList();
	}

	@Override
	public List<ThoughtResponseDTO> getAllbyUser(Long userId) {
		return thoughtRepo.findByUserId(userId).stream().map(ThoughtResponseDTO::new).toList();
	}

	@Override
	public ThoughtResponseDTO getTought(Long thoughtId) {
		return new ThoughtResponseDTO(thoughtRepo.findById(thoughtId).get());
	}

	@Override
	public ThoughtResponseDTO createThought(ThoughtsRequestDTO requestDTO) {
		return new ThoughtResponseDTO(thoughtRepo.save(requestDTO.convertToModel()));
	}

	@Override
	public ThoughtResponseDTO updateThought(Long thoughtId, ThoughtsRequestDTO requestDTO) {
		Thoughts thought =  thoughtRepo.findById(thoughtId).get();
		Thoughts thoughtNew =requestDTO.convertToModel();
		thoughtNew.setThoughtId(thoughtId);
		return new ThoughtResponseDTO(thoughtRepo.save(thoughtNew));
	}

	@Override
	public ThoughtResponseDTO deleteThought(Long thoughtId) {
		Thoughts thought =  thoughtRepo.findById(thoughtId).get();
		thought.setIsDelete(true);
		return new ThoughtResponseDTO(thoughtRepo.save(thought));
	}

}
