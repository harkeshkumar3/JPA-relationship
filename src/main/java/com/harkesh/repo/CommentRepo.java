package com.harkesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harkesh.model.Comments;

@Repository
public interface CommentRepo extends JpaRepository<Comments, Integer> {

	public Comments findById(int id);
	
	public Comments findByText(String text);
}
