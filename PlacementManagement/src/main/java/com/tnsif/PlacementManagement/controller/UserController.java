package com.tnsif.PlacementManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.PlacementManagement.entity.User;
import com.tnsif.PlacementManagement.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService us;
	

	@PostMapping("/saveuser")
	public User registeruser(@RequestBody User u) {
		return us.registeruser(u);
	}
	
	@GetMapping("/getusers")
	public List<User> getusers(){
		return us.getusers();
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public void deleteuser(@PathVariable ("id")Integer id) {
		us.deleteuser(id);
	}

	

}
