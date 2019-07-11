package com.aceproject.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aceproject.board.config.CommonDao;
import com.aceproject.board.dto.UserDto;

@Repository("userDao")
public class UserDaoMybatis extends CommonDao implements UserDao {

	protected static final String NAMESPACE = "com.aceproject.board.dao.";

	@Override
	public int save(UserDto user) {     
		return getSqlSession().insert(NAMESPACE + "insertUser", user);

	}

	@Override
	public UserDto getUserOne(int userId) {
		return getSqlSession().selectOne(NAMESPACE + "selectUserById", userId);
	}

	@Override
	public List<UserDto> getUserAll() {
		return null;
	}

}
