package org.prathyusha.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.prathyusha.model.Circle;

@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint){
		
	}
	
	
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgumentMethods(String name, Object returnString) {
		System.out
				.println("A method that takes String arguments has been called. The value is "
						+ name + "The output value is " + returnString);
	}

	@AfterThrowing(pointcut="args(name)", throwing="ex" )
	public void exceptionAdvice(String name, RuntimeException ex) {
		System.out.println("An Exception has been Thrown" + ex);
	}
	
	
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}	
	
	@Pointcut("within(org.prathyusha.model.Circle)")
	public void allCircleMethods() {}
	
	
	
}
