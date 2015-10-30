package com.miya_masa.sample.service;

import java.util.List;

import com.miya_masa.sample.domain.User;

public interface UserService {

	List<User> findAll();

	User findById(String id);

}
