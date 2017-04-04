package com.myjava.service.impl;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjava.dao.UserDao;
import com.myjava.entity.User;
import com.myjava.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao ;
	@Override
	public Collection<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public Collection<User> findByIds(Long[] ids) {
		return userDao.findByIds(ids);
	}

	@Override
	public User getById(Long id) {
		return userDao.get(id);
	}

	@Override
	public void deleteById(Long id) {
		userDao.deleteById(id);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void insert(User user) {
		userDao.insert(user);
	}

	@Override
	public void deleteByIds(Long[] ids) {
		userDao.deleteByIds(ids);
	}
}
