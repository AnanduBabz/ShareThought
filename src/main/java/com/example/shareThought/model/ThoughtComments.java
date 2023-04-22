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
public class ThoughtComments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long commentId ;
	private Long thoughtId ;
	private String comment;
	private Long commentBy ;
	private Date createdDate ;
	private Long updatedBy ;
	private Date updatedDate ;
	private Boolean isEdited ;
	private Boolean isDelete;
}
