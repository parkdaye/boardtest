package com.aceproject.board.dao;

import java.util.List;
import com.aceproject.board.dto.UserDto;

public interface UserDao {
	
	int save(UserDto user);
	
	UserDto getUserOne(int UserId);
	
	List<UserDto> getUserAll();
	
}
