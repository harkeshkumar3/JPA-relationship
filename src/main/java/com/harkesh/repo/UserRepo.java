package com.harkesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harkesh.model.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {

}
