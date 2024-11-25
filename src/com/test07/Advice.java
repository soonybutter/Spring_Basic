package com.test07;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class Advice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		String methodName = invocation.getMethod().getName();
		
		//utill framework 스탑워치
		StopWatch timer = new StopWatch();
		
		timer.start();
		System.out.println("[LOG] METHOD : "+ methodName+" is Calling");
		Object obj =invocation.proceed();
		timer.stop();
		System.out.println("[LOG] METHOD : "+ methodName +" was Called");
		System.out.println("[LOG] TIME : "+ timer.getTotalTimeSeconds()+"sec");
		
		
		return obj;
	}
	
	

}
