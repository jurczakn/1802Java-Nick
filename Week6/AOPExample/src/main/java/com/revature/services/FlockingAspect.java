package com.revature.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FlockingAspect {
	
	@Before("execution(void *.fly (..))")
	public void beforeFly(JoinPoint jp){
		
		System.out.println("about to fly");
		
	}
	
	@After("execution(* *.* (..))")
	public void landing(JoinPoint jp){
		
		System.out.println("about to land");
		
	}
	
	@Around("execution(* *.* (..))")
	public Object aroundTest(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println("before");
		
		Object ret = pjp.proceed();
		
		System.out.println("after");
		
		return ret + "hi";
		
	}

}
