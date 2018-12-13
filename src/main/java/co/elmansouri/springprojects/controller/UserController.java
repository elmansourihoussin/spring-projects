package co.elmansouri.springprojects.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.elmansouri.springprojects.entities.User;
import co.elmansouri.springprojects.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public User add(@Valid @RequestBody User user) {
		return this.userService.add(user);
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> findById(@PathVariable Long id) {
		return this.userService.find(id);
	}
	
	

}
