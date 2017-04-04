package com.myjava.testSpring;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 测试Spring
 * @author mr.lxf
 * @data 2017年3月29日 下午11:56:33
 */
public class TestSpring {
	@Test
	public void testBean(){
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory factory = (SqlSessionFactory) ac.getBean("sqlSessionFactory");
		System.out.println(factory);
	}
}
