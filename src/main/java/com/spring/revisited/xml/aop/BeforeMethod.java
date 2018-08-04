/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.xml.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author Vishnu Garg
 * @created On May 2, 2018
 *
 */
public class BeforeMethod implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("===SPRING AOP=== BeforeMethod : Execute before method!");
		
	}
}

