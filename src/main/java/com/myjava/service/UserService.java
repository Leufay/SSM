package com.myjava.service;

import java.util.Collection;

import com.myjava.entity.User;

public interface UserService {
	/**
	 * 查找全部
	 * @return
	 */
	public Collection<User> findAll();
	/**
	 * 根据多个ID查找
	 * @param ids the array of entity's id
	 * @return
	 */
	public Collection<User> findByIds(Long[] ids) ;
	/**
	 * 根据指定ID查找
	 * @param ids the entity's id
	 * @return
	 */
	public User getById(Long id) ;
	/**
	 * 根据ID删除
	 * @param id the entity's id
	 */
	public void deleteById(Long id) ;
	
	public void deleteByIds(Long[] ids) ;
	/**
	 * 更新
	 * @param user entity
	 */
	public void update(User user) ;
	/**
	 * 增加
	 * @param user entity
	 */
	public void insert(User user);
}
