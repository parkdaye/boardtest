package com.aceproject.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aceproject.board.config.CommonDao;
import com.aceproject.board.dto.BoardDto;

@Repository("boardDao")
public class BoardDaoMybatis extends CommonDao implements BoardDao {

	protected static final String NAMESPACE = "com.aceproject.board.dao.";

	@Override
	public List<BoardDto> getBoardList() {
		return getSqlSession().selectList(NAMESPACE + "selectBoardList");
	}

	@Override
	public BoardDto getPostById(int boardId) {
		return getSqlSession().selectOne(NAMESPACE + "selectPostById", boardId);
	}

	@Override
	public int insertPost(BoardDto board) {
		return getSqlSession().insert(NAMESPACE + "insertPost", board);
	}

	@Override
	public void updatePost(BoardDto board) {
		getSqlSession().update(NAMESPACE + "updatePost", board);
	}

	@Override
	public void deletePost(int boardId) {
		getSqlSession().delete(NAMESPACE + "deletePost", boardId);
	}

}
