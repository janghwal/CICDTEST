package com.example.cicdtest.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {

	public String serviceTest(String str) {
		return str;
	}
}
