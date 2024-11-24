package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Emp yang= (Emp)factory.getBean("yang");
		Emp park= (Emp)factory.getBean("park");
		
		System.out.println(yang);
		System.out.println(park);

	}

}
