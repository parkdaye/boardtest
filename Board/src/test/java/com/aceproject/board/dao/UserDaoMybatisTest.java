package com.aceproject.board.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.aceproject.board.dto.UserDto;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class UserDaoMybatisTest {
	
	@Autowired
	private UserDao userDaoMybatis;
	
	@Test
	@Rollback(true)
	public void test() {
	//	UserDto user = new UserDto(1, "daye", "1234", new Date(System.currentTimeMillis()));
		//UserDto testUser = UserDto.builder();
//		userDaoMybatis.save();
//		
		List<UserDto> userList = userDaoMybatis.getUserAll();
		
		UserDto user = userList.get(0);
		//asserThat(user.getNickname(), is("daye"));
	}

}
