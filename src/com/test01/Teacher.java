package com.test01;

public class Teacher {
	
	public void classWork() {
		System.out.println("컴퓨터를 켠다.");
		
		try {
			System.out.println("줌 회의를 시작한다.");
		} catch (Exception e) {
			System.out.println("쉬는 날이었다.");
		} finally {
			System.out.println("집에 간다.");
		}
		
	}

}
