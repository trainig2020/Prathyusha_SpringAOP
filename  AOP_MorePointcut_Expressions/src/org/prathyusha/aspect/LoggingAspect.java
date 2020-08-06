package org.prathyusha.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {


	//@Before("execution(public String org.prathyusha.model.Circle.getName())")
	//@Before("execution(public * get*())")
	//@Before("execution(* get*(..))")
	//@Before("execution(* org.prathyusha.model.*.get*())")
	
	//@Before("execution(* get*())")
	@Before("allGetters() && allTriangleMethods()")
	public void LoggingAdvice(){
		System.out.println("Advice run, Get Method called");
	}
	
	//@Before("execution(* get*())")
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("Second Advice executed");
	}
	
	//Dummy Method
	@Pointcut("execution(* get*())")
	public void allGetters() {}	
	
	@Pointcut("within(org.prathyusha.model.Triangle)")
	//@Pointcut("execution(* * org.prathyusha.model.Circle.*(..))")
	//if we have 100 methods then it will return all methods
	public void allTriangleMethods() {}
	
	
	
}
