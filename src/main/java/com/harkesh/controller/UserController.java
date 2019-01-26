package com.harkesh.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.harkesh.info.CommentInfo;
import com.harkesh.info.UserInfo;
import com.harkesh.model.Comments;
import com.harkesh.model.Posts;
import com.harkesh.model.UserAddress;
import com.harkesh.model.UserEntity;
import com.harkesh.repo.CommentRepo;
import com.harkesh.repo.UserAddressRepo;
import com.harkesh.repo.UserRepo;

@RestController
public class UserController {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private UserAddressRepo addressRepo;
	

	@GetMapping("/getAllUser")
	public Collection<UserEntity> getAllUserList() {
		return userRepo.findAll();
	}

	@GetMapping("/getuser/{userId}")
	public Optional<UserEntity> getUserEntity(@PathVariable int userId) {
		return userRepo.findById(userId);
	}

	@PostMapping("/saveuser")
	public UserEntity saveUse(@RequestBody UserInfo userInfo) {
		System.out.println("save user ===>>>");
		UserEntity user = new UserEntity();
		user.setFirstName(userInfo.getFirstName());
		user.setLastName(userInfo.getLastName());
		user.setUserName(userInfo.getUserName());
		user.setEmail(userInfo.getEmail());
		user.setCommonField(userInfo.getCommonField());
		user.setRoles(userInfo.getRoles());

		return userRepo.save(user);
	}

	@PostMapping("/saveadd")
	public UserAddress saveAddress(@RequestBody UserAddress address) {
		System.out.println("Save User Address =========>>>");
		return addressRepo.save(address);
	}

	
}
