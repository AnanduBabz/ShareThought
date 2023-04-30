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

import com.example.shareThought.requestDTO.ThoughtsRequestDTO;
import com.example.shareThought.responseDTO.ThoughtResponseDTO;
import com.example.shareThought.service.ThoughtService;

@RestController
@RequestMapping("/thoughts")
public class ThoughtController {
	
	@Autowired
	ThoughtService thoughtService;
	
	@GetMapping
	public List<ThoughtResponseDTO> getAll(){
		return thoughtService.getAll();
	}
	
	@GetMapping("/user/{userId}")
	public List<ThoughtResponseDTO> getAllbyUser(@PathVariable Long userId){
		return thoughtService.getAllbyUser(userId);
	}
	
	@GetMapping("/{thoughtId}")
	public ThoughtResponseDTO getTought(@PathVariable Long thoughtId){
		return thoughtService.getTought(thoughtId);
	}
	
	@PostMapping
	public ThoughtResponseDTO createThought(@RequestBody ThoughtsRequestDTO requestDTO) {
		return thoughtService.createThought(requestDTO);
	}
	
	@PutMapping("/{thoughtId}")
	public ThoughtResponseDTO updateThought(@PathVariable Long thoughtId,@RequestBody ThoughtsRequestDTO requestDTO) {
		return thoughtService.updateThought(thoughtId,requestDTO);
	}
	
	@DeleteMapping("/{thoughtId}")
	public ThoughtResponseDTO deleteThought(@PathVariable Long thoughtId) {
		return thoughtService.deleteThought(thoughtId);
	}


}
