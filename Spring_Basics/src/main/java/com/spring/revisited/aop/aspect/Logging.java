/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Vishnu Garg
 * @created On Aug 5, 2018
 *
 */
	@Aspect
	public class Logging {
	   /** Following is the definition for a pointcut to select
	      *  all the methods available. So advice will be called
	      *  for all the methods.
	   */
	   @Pointcut("execution(* com.spring.revisited.aop.aspect.*.*(..))")
	   private void selectAll(){
		   System.out.println(" Selecting All The methods");
		   
	   }

	   /** 
	      * This is the method which I would like to execute
	      * before a selected method execution.
	   */
	   @Before("selectAll()")
	   public void beforeAdvice(){
	      System.out.println("beforeAdvice Going to setup student profile.");
	   }

	   /** 
	      * This is the method which I would like to execute
	      * after a selected method execution.
	   */
	   @After("selectAll()")
	   public void afterAdvice(){
	      System.out.println("afterAdvice Student profile has been setup.");
	   }

	   /** 
	      * This is the method which I would like to execute
	      * when any method returns.
	   */
	   @AfterReturning(pointcut = "selectAll()", returning = "retVal")
	   public void afterReturningAdvice(Object retVal){
	      System.out.println(" @AfterReturning Returning:" + retVal.toString() );
	   }

	   /**
	      * This is the method which I would like to execute
	      * if there is an exception raised by any method.
	   */
	   @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
	   public void AfterThrowingAdvice(IllegalArgumentException ex){
	      System.out.println("AfterThrowingAdvice There has been an exception: " + ex.toString());   
	   }
	}


