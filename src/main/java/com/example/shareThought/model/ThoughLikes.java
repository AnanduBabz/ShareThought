package com.example.shareThought.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class ThoughLikes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long likeId ;
	private Long thoughtId ;
	private Long userId ;
	private Date createdDate ;
	private Date updatedDate ;
	private Boolean isDelete ;
	
}
