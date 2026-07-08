package com.tnsif.PlacementManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.PlacementManagement.entity.User;
import com.tnsif.PlacementManagement.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo ur;
	
	public User registeruser(User u) {
		return ur.save(u);
	}
	
	
	public List<User> getusers(){
		return (List<User>) ur.findAll();
	}
	
	public void deleteuser(Integer id) {
		ur.deleteById(id);
	}
	

	

}
