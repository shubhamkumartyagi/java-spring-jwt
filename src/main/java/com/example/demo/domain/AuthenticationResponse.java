package com.example.demo.domain;

import lombok.Data;

@Data
public class AuthenticationResponse {
	
	private String jwt;

	public AuthenticationResponse(String jwt) {
		this.jwt = jwt;
	}
	
}
