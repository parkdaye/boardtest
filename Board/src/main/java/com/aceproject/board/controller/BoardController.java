package com.aceproject.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.aceproject.board.dto.BoardDto;
import com.aceproject.board.service.BoardService;

@Controller
public class BoardController {
	private final BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;  
	}

	@GetMapping("/boards")
	public String getBoardList(Model model) {
		model.addAttribute("boardlist", boardService.getBoardList());
		return "boardlist";
	}
	
	@GetMapping("/boards/{boardId}")
	public String getBoardPost(@PathVariable("boardId") int boardId, Model model) {
		model.addAttribute("boardPost", boardService.getPostById(boardId));
		return "board";
	}
	
	@GetMapping("/boards/posts")
	public String writePostForm() {
		System.out.println("get boards/posts");
		return "writepost";
	}
	
	
	@PostMapping("/boards/posts") 
	public String writePost(@RequestBody BoardDto board){
		System.out.println("berfro");
		boardService.writePost(board);
		System.out.println("test");
		return "redirect://localhost:8080/boards";
	}
	
	@GetMapping("/boards/posts/{boardId}")
	public String updatePostForm(@PathVariable("boardId") int boardId, Model model) {
		model.addAttribute("boardPost", boardService.getPostById(boardId));
		return "updatepost";
	}
	
	@PutMapping("/boards/posts/{boardId}")
	public String updatePost(@RequestBody BoardDto board, @PathVariable("boardId") int boardId) {
		boardService.updatePost(board);
		return "redirect:boards/" + boardId;
	}
	
	@DeleteMapping("/boards/posts/{boardId}")
	public String deletePost(@PathVariable("boardId") int boardId) {
		boardService.deletePost(boardId);
		return "redirect:/boards";
	}
}
