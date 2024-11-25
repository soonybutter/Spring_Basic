package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		TV tv = factory.getBean("lgTV", TV.class);
		tv.powerOn();
		tv.powerOff();
		
		tv = (TV)factory.getBean("sam"); //component annotation 할때 이름을 "sam"으로 해줌!
		tv.powerOn();
		
		

	}

}
