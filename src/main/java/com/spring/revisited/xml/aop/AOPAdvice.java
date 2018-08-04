/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.xml.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

/**
 * @author Vishnu Garg
 * @created On Aug 3, 2018
 *
 */
public class AOPAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice, MethodInterceptor {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("===SPRING AOP=== AfterReturningMethod : Execute after return method ");
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("===SPRING AOP=== BeforeMethod : Execute before method!");
	}

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("===SPRING AOP=== AroundMethod: Method name : " + methodInvocation.getMethod().getName());
		System.out.println(
				"===SPRING AOP=== AroundMethod: Method arguments :" + Arrays.toString(methodInvocation.getArguments()));
		System.out.println("===SPRING AOP=== AroundMethod: Before method execute");
		try {
			Object result = methodInvocation.proceed();
			System.out.println("===SPRING AOP=== AroundMethod: After method execute");
			return result;
		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out.println("===SPRING AOP=== AroundMethod: When method exception throws ");
			throw e;
		}
	}

	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("===SPRING AOP=== AfterThrowingExceptionMethod : Execute when method throws exception");
	}
}
