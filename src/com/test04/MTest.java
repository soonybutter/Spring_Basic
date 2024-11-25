package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
	
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		
		Person s = factory.getBean("student", Person.class);
		Person t = factory.getBean("teacher",Person.class);
		
		System.out.println("학생");
		s.Classwork();
		System.out.println("------------");
		System.out.println("강사");
		t.Classwork();
	}

}
