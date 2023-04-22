package com.example.shareThought.model;

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
public class ThoughtSettings {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ruleId ;
	private Long userId  ;
	private String thoughtType ;
	private String shareType ;
	private Long commentType ;
}
