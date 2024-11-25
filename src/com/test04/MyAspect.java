package com.test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(public * *(..))")
	public void before(JoinPoint join){
		System.out.println(join.getTarget().getClass());
		System.out.println(join.getSignature().getName());
		
		System.out.println("컴퓨터를 켠다.");
	
	}
	
	@After("execution(public * * (..))")
	public void after(JoinPoint join) {
		
		System.out.println("집에 간다.");
	}
	
	@AfterReturning(pointcut="execution(public * *(..))", returning="returnVal")
	public void returning(Object returnVal) {
		System.out.println(returnVal +" 공부하는 날이었다.");
		
	}
	
	@AfterThrowing("execution(public * *(..))")
	public void throwing() {
		System.out.println("쉬는 날이었다.");
	}
}
