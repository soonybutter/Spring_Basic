package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {

		//bean 생성 후 확인
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Emp yang = factory.getBean("yang",Emp.class);
		Emp park= factory.getBean("park",Emp.class);
		System.out.println(yang);
		System.out.println(park);
		
		
		
	}

}
