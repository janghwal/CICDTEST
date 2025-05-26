package com.example.cicdtest.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestServiceTest {

	@Test
	void serviceTest() {
		int a = 0;
		int b = 0;

		assertEquals(a, b);
	}
}