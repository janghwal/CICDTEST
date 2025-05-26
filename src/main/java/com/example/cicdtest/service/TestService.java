package com.example.cicdtest.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {

	@Value("${jwt.secret.key}")
	private String secretKey;

	public String serviceTest(String str) {
		return secretKey;
	}
}
