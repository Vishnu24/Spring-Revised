/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Vishnu Garg
 * @created On Aug 3, 2018
 *
 */
public class EmployeeXMLConfigAspect {
	
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("EmployeeXMLConfigAspect:: Before invoking getName() method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("EmployeeXMLConfigAspect:: After invoking getName() method. Return value="+value);
		return value;
	}
}
