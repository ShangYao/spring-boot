package com.longen.boot.service;

import java.util.List;

import com.longen.boot.domain.User;

public interface UserService {
	List<User> getUserList();

	User findUserById(long id);

	void saveUser(User user);

	void delete(long id);
}
