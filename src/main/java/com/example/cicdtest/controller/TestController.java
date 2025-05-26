package com.example.cicdtest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cicdtest.service.TestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
	private final TestService testService;

	@PostMapping
	public ResponseEntity<String> controllerTest(
		@RequestParam String str
	) {

		String result = testService.serviceTest(str);
		return new ResponseEntity<>(result, HttpStatus.OK);

	}
}
