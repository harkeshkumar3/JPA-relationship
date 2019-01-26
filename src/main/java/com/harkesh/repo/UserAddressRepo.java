package com.harkesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harkesh.model.UserAddress;

@Repository
public interface UserAddressRepo extends JpaRepository<UserAddress, Integer> {

}
