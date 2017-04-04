package com.myjava.dao;

import java.util.Collection;

public interface BaseDao<T> {
	public Collection<T> findAll();
	public Collection<T> findByIds(Long[] id) ;
	public T get(Long id) ;
	public void deleteById(Long id) ;
	public void deleteByIds(Long[] ids) ;
	public void update(T t) ;
	public void insert(T t);
}
