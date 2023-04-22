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
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId ;
	private String userName ;
	private String firstName ;
	private String middleName ;
	private String lastName ;
	private Integer age ;
	private Long mobile ;
	private String email ;
	private String password ;
	private Date createdDate ;
	private Date updatedDate;
	private Boolean isDelete ;
}
