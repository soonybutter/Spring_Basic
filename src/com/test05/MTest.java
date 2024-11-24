package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("com/test05/applicationContext.xml");
		
		Developer yang = (Developer)factory.getBean("yangdy");
		System.out.println(yang);

		Engineer kim = factory.getBean("kimdy",Engineer.class);
		System.out.println(kim);
	}

}
