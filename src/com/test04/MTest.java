package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");

		
		Developer yang =factory.getBean("yangdy",Developer.class);
		Engineer park = factory.getBean("parkjh", Engineer.class);
		
		System.out.println(yang);
		System.out.println(park);
		
		
	}

}
