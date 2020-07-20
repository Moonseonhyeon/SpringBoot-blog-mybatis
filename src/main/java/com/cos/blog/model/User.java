package com.cos.blog.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	private String profile;
	private Timestamp createDate;
	
}