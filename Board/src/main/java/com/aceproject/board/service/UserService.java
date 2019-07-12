package com.aceproject.board.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aceproject.board.dao.UserDao;
import com.aceproject.board.dto.UserDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService {
	private UserDao userDao;
	
	@Transactional
	public int saveUser(UserDto dto) {
		return userDao.save(dto);
	}
	
//	@Transactional(readOnly = true)
	public List<UserDto> getUserAll() {
		return userDao.getUserAll();
	}
	
	@Transactional(readOnly = true)
	public UserDto getUserOne(int userId) {
		return userDao.getUserOne(userId);
	}
}
