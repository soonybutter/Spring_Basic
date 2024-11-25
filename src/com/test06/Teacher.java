package com.test06;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements Person{
	
	@Override
	public void classWork() {
		System.out.println("줌 회의를 시작한다.");
		
	}

	
}
