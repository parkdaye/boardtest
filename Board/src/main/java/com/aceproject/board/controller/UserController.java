package com.aceproject.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.aceproject.board.dto.UserDto;
import com.aceproject.board.service.UserService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Controller
public class UserController {
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/users")
	public int saveUser(@RequestBody UserDto dto) {
		return userService.saveUser(dto);
	}
	
	
	@GetMapping("/users")
	public void getUsers(Model model) {
		model.addAttribute("users", userService.getUserAll());
	}
	
	@GetMapping("/{userId}")
	public void getUserOne(@PathVariable("userId") int userId, Model model) {
		model.addAttribute("users", userService.getUserOne(userId));
	}
	
}
