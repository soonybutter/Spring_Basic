package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		//aop 설정, bean 생성을 annotation으로 처리하여 확인하는 코드 완성
		
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test06/applicationContext.xml");
		
		Person s = factory.getBean("student", Person.class);
		Person t = factory.getBean("teacher", Person.class);
		
		System.out.println("학생");
		s.classWork();
		System.out.println("-------------");
		System.out.println("강사");
		t.classWork();
		
		
		
	}

}
