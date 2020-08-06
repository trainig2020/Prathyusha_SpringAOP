package org.prathyusha.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.prathyusha.model.Circle;

/*@Aspect*/
public class LoggingAspect {

		
		//@Around("@annotation(org.prathyusha.aspect.Loggable)")
		public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
			Object returnValue = null;
			try {

				System.out.println("Before Advice");
				returnValue=proceedingJoinPoint.proceed();
				System.out.println("After Returning");
			} catch (Throwable e) {
				System.out.println("After Throwing");
			}
			System.out.println("After Finally");
			return returnValue;
		}

	
		
	/*@Pointcut("execution(* get*())")
	public void allGetters() {}	*/
	
	
	
}
