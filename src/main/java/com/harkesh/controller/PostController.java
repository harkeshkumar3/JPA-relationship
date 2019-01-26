package com.harkesh.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harkesh.info.CommentInfo;
import com.harkesh.model.Comments;
import com.harkesh.model.Posts;
import com.harkesh.repo.CommentRepo;
import com.harkesh.repo.PostRepo;

@RestController
public class PostController {

	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired PostRepo postRepo;

	@GetMapping("/post")
	public Posts getPostJons() {
		return new Posts();
	}

	@GetMapping("/comment")
	public Comments getCommentJosn() {
		return new Comments();
	}

	@PostMapping("/saveComment")
	public Comments saveComments(@RequestBody CommentInfo com) {
		System.out.println("I am in Comments");
		Comments comments = new Comments();
		comments.setPost(com.getPost());
		comments.setText(com.getText());
		return commentRepo.save(comments);
	}

	@GetMapping("/findcomment/{id}")
	public Comments getCommentById(@PathVariable int id) {
		System.out.println("The Comments is =====" + id);
		return commentRepo.findById(id);
	}
	
	@GetMapping("/post/{postId}")
	public Optional<Posts> getPostByPostId(@PathVariable int postId) {
		return  postRepo.findById(postId);
	}
	@GetMapping("/post/{postId}/{active}")
	public Posts getPostByPostId(@PathVariable int postId, @PathVariable boolean active) {
		return  postRepo.findByIdAndCommonFieldIsActive(postId, active);
	}
	
	@GetMapping("/postby/{id}/{by}")
	public Posts getPostByPostBy(@PathVariable int id, @PathVariable int by) {
		return  postRepo.findByIdAndCommonFieldCreatedBy(id, by);
	}
	
	

}
