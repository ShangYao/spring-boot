package com.longen.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.longen.boot.dao.UserRepository;
import com.longen.boot.domain.User;
import com.longen.boot.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userDao;

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public User findUserById(long id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

}
