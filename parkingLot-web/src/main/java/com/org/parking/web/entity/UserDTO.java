package com.org.parking.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserDTO {
	
	@Id
	private String user;
	@Column
	private String password;
	@Column
	private String role;
	@Column
	private String status;

}
