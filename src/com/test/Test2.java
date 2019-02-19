package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;

public class Test2 {
	public static void main(String[] args) {
		// ����������ʹ��spring����
		// �õ�spring��applicationContext����(��������
		/*
		 * ͨ����·����ȡApplicationContext ��������
		 * �����ȴ�����һ��ClassPathXmlApplicationContext����ac����ȡϵͳ�е������ļ�applicationContext.xml
		 * �ڸ��ļ����������ļ��е���Ϣ�����������Ϣ��Ȼ��ʹ��ClassPathXmlApplicationContext�е�getBean����
		 * ���idΪuseSercice��bean����
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// �ѻ��bean����ǿ��ת��Ϊһ��UserService����
		UserService us = (UserService) ac.getBean("useSercice");
		// us�������UserService�е�sayHello()
		us.sayHello();
	}
}
