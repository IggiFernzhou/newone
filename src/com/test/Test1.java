package com.test;

import com.service.UserService;

public class Test1 {
	public static void main(String[] args) {
		// ������ʹ�ô�ͳ�ķ�����������UserService�� sayHello����
		// ����һ��service����
		UserService us = new UserService();
		// ����setName()������������
		us.setName("spring");
		// ����sayHello()����
		us.sayHello();
	}
}
