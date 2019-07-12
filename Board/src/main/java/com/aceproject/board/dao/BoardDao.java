package com.aceproject.board.dao;

import java.util.List;

import com.aceproject.board.dto.BoardDto;

public interface BoardDao {
	
	List<BoardDto> getBoardList();
	
	BoardDto getPostById(int boardId);
	
	int insertPost(BoardDto board);
	
	void updatePost(BoardDto board);
	
	void deletePost(int boardId);
}
