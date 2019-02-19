package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;

public class Test2 {
	public static void main(String[] args) {
		// 接下来我们使用spring来做
		// 得到spring的applicationContext对象(容器对象）
		/*
		 * 通过类路径获取ApplicationContext 对象引用
		 * ①首先创建了一个ClassPathXmlApplicationContext对象ac并读取系统中的配置文件applicationContext.xml
		 * ②该文件依据配置文件中的信息获得容器的信息，然后使用ClassPathXmlApplicationContext中的getBean方法
		 * 获得id为useSercice的bean对象
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 把获得bean对象强制转换为一个UserService对象
		UserService us = (UserService) ac.getBean("useSercice");
		// us对象调用UserService中的sayHello()
		us.sayHello();
	}
}
