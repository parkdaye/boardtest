package com.aceproject.board.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BoardDto {
	
	private int boardId;
	
	private String title = "";
	
	private String content = "";
	
	private Date boardCrtDate;
	
	private int userId;
	
	private String userNickname = "";

}
