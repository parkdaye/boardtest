package com.aceproject.board.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserControllerTest {
	
	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void userPageTest() {
		RestTemplate template = new RestTemplate();
		String body = this.restTemplate.getForObject("/users", String.class);
		
		assertThat(body).contains("회원가입");
	}

}
