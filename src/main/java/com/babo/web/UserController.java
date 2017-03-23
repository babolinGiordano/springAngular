package com.babo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.babo.model.User;
import com.babo.service.UserService;

@RestController
@RequestMapping("/rest")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> findAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public User findById(Long id) {
		System.out.println(id);
		return userService.findById(id);
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	public void save(User user) {
		userService.save(user);
	}

	@RequestMapping(value = "/users", method = RequestMethod.PUT)
	@ResponseStatus(code = HttpStatus.OK)
	public void update(User user) {
		userService.update(user);
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(Long id) {
		userService.delete(id);
	}

}
