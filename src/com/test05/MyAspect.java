package com.test05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
	@Pointcut("execution(public void *(..))")
	public void myClass() {}
	
	
	@Before("myClass()") //pointcut 설정한 메서드만 담아주면 됨.
	public void before() {
		
		System.out.println("컴퓨터를 켠다.");
	}
	
	@After("myClass()")
	public void after() {
		System.out.println("집에 간다.");
		
	}
	
}
