package com.test01;

public class Student {
	public void classWork() {
		System.out.println("컴퓨터를 킨다.");
		
		try {
			System.out.println("qr을 찍는다.");
		} catch (Exception e) {
			System.out.println("쉬는 날이었다.");
		} finally {
			System.out.println("집에 간다.");
		}
		
		
	}

}
