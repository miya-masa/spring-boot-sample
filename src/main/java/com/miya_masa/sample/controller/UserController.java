package com.miya_masa.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miya_masa.sample.domain.User;
import com.miya_masa.sample.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("getAll")
	public List<User> getAll() {
		return userService.findAll();
	}

	@RequestMapping("get/{id}/")
	public User get(@PathVariable String id) {
		log.info("id : {}", id);
		return userService.findById(id);
	}

}
