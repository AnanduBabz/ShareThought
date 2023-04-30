package com.example.shareThought.requestDTO;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.example.shareThought.model.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRequestDTO {
	
	private String userName ;
	private String firstName ;
	private String middleName ;
	private String lastName ;
	private Integer age ;
	private Long mobile ;
	private String email ;
	private String password ;
	
	public User convertTomodel() {
		User user = new User();
		BeanUtils.copyProperties(this, user);
		user.setCreatedDate(new Date());
		user.setIsDelete(false);
		return user;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User convertTomodel(User user) {
		user.setFirstName(this.firstName!=null?this.firstName:user.getFirstName());
		user.setMiddleName(this.middleName!=null?this.middleName:user.getMiddleName());
		user.setUserName(this.userName!=null?this.userName:user.getUserName()); 
		user.setLastName(this.lastName!=null?this.lastName:user.getLastName());
		user.setEmail(this.email!=null?this.email:user.getEmail());
		user.setMobile(this.mobile!=null?this.mobile:user.getMobile());
		return user;
	}
	
	

}
