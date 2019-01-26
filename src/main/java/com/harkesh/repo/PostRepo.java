package com.harkesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.harkesh.model.Posts;

@Repository
public interface PostRepo extends JpaRepository<Posts, Integer> {

	//@Query("From Posts p where p.id=1 and p.commonField.active=1")
	public Posts findByIdAndCommonFieldIsActive(int id, boolean active);
	
	public Posts findByIdAndCommonFieldCreatedBy(int id, int createdBy);
	
	
}
