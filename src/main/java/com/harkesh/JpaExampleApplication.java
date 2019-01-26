package com.harkesh;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.harkesh.model.CommonField;
import com.harkesh.model.RoleEntity;
import com.harkesh.model.UserAddress;
import com.harkesh.model.UserEntity;
import com.harkesh.repo.UserRepo;

@SpringBootApplication
public class JpaExampleApplication {

	@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaExampleApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * System.out.println("Am In RUN Method"); List<UserAddress> addList = new
	 * ArrayList<UserAddress>(); UserAddress add = new UserAddress();
	 * add.setCity("Delhi"); add.setPincode(12201); add.setState("HR");
	 * addList.add(add);
	 * 
	 * List<RoleEntity> roleList = new ArrayList<RoleEntity>(); RoleEntity roles =
	 * new RoleEntity(); roles.setRoleName("Admin"); roleList.add(roles);
	 * 
	 * UserEntity user = new UserEntity(); user.setUserName("harkesh");
	 * user.setFirstName("Harkesh"); user.setLastName("Kumar");
	 * user.setEmail("Harkesh.kumar3@gmail.com"); user.setCommonField(new
	 * CommonField(true, new Date(), new Date(), 1, 1)); user.setAddress(null);
	 * user.setRoles(roleList);
	 * 
	 * userRepo.save(user);
	 * 
	 * }
	 */
}
