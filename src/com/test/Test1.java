package com.test;

import com.service.UserService;

public class Test1 {
	public static void main(String[] args) {
		// 首先先使用传统的方法，来调用UserService的 sayHello方法
		// 创建一个service对象
		UserService us = new UserService();
		// 调用setName()方法设置属性
		us.setName("spring");
		// 调用sayHello()方法
		us.sayHello();
	}
}
