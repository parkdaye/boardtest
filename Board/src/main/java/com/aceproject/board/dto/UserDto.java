package com.aceproject.board.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class UserDto {
	private int id;
	private String nickname;
	private String password;
	private Date crtDate;
}
