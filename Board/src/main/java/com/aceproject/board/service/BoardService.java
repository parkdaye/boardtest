package com.aceproject.board.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aceproject.board.dao.BoardDao;
import com.aceproject.board.dto.BoardDto;
import com.aceproject.board.dto.UserDto;

@Service
public class BoardService {
	private final BoardDao boardDao;
	
	public BoardService(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	@Transactional(readOnly = true)
	public List<BoardDto> getBoardList() {
		return boardDao.getBoardList();
	}
	
	@Transactional(readOnly = true)
	public BoardDto getPostById(int boardId) {
		return boardDao.getPostById(boardId);
	}
	
	@Transactional
	public int writePost(BoardDto board) {
		return boardDao.insertPost(board);
	}

	@Transactional
	public void updatePost(BoardDto board) {
		boardDao.updatePost(board);
	}
	
	@Transactional
	public void deletePost(int boardId) {
		boardDao.deletePost(boardId);
	}
	
}
