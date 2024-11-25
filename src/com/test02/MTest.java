package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Person s = factory.getBean("student",Person.class);
		Person t = factory.getBean("teacher",Person.class);

		System.out.println("학생");
		s.ClassWork();
		System.out.println("--------");
		System.out.println("강사");
		t.ClassWork();
	}

}
