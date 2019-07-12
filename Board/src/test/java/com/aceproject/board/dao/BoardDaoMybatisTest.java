package com.aceproject.board.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.aceproject.board.dto.BoardDto;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BoardDaoMybatisTest {

	@Autowired
	private BoardDao boardDao;
	
	@Test
	public void test() {
		BoardDto board = BoardDto.builder()
				.title("hi")
				.content("hello world")
				.userId(1)
				.build();
		
		int boardId = boardDao.insertPost(board);
		
		BoardDto board2 = boardDao.getPostById(boardId);
		assertThat(board.getTitle(), is(board2.getTitle()));
		
	}

}
