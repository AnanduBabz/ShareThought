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
public class Thoughts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long thoughtId ;
	private Long userId;
	private String thoughtType ;
	private String content ;
	private Long likeCount ;
	private Long commentCount ;
	private String shareType ;
	private Long imageId ;
	private Date createdDate ;
	private Date updatedDate ;
	private Boolean isLikeAllowed ;
	private Boolean isCommentAllowed ;
	private Boolean isDelete;
}
