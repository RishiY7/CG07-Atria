package com.tnsif.PlacementManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.tnsif.PlacementManagement.entity.User;

public interface UserRepo extends CrudRepository<User, Integer> {
	

}
