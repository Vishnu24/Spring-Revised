/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.aop.aspect;

/**
 * @author Vishnu Garg
 * @created On Aug 3, 2018
 *
 */
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName()");
	}
	
	@Before("execution(* com.spring.revisited.model.*.get*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called");
	}
}

