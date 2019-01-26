package com.harkesh.info;

import com.harkesh.model.Posts;

public class CommentInfo {
	private int id;
	private String text;
	private Posts post;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Posts getPost() {
		return post;
	}
	public void setPost(Posts post) {
		this.post = post;
	}

	
	
}
