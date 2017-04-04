package com.myjava.dao.impl;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.myjava.dao.BaseDao;
@Repository
public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T>{
	private String nameSpace ;
	@Resource
	public void setSF(SqlSessionFactory sessionFactory){
		super.setSqlSessionFactory(sessionFactory);
	}
	public String getNameSpace() {
		return nameSpace;
	}

	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
	}

	@Override
	public Collection<T> findAll() {
		return getSqlSession().selectList(nameSpace+".findAll", null);
	}

	@Override
	public Collection<T> findByIds(Long[] ids) {
		return getSqlSession().selectList(nameSpace+"findByIds", ids);
	}

	@Override
	public T get(Long id) {
		return getSqlSession().selectOne(nameSpace+".get", id);
	}

	@Override
	public void deleteById(Long id) {
		getSqlSession().delete(nameSpace+".deleteById", id);
	}

	@Override
	public void deleteByIds(Long[] ids) {
		getSqlSession().delete(nameSpace+".deleteByIds", ids);
	}

	@Override
	public void update(T t) {
		getSqlSession().update(nameSpace+".update",t) ;
	}

	@Override
	public void insert(T t) {
		getSqlSession().insert(nameSpace+".insert", t);
	}

}
