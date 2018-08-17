/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.aop.aspect;

/**
 * @author Vishnu Garg
 * @created On Aug 5, 2018
 *
 */
public class Student {

	private Integer age;
	   private String name;

	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   public Integer getAge() {
		  System.out.println("Age : " + age );
	      return age;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      System.out.println("Name : " + name );
	      return name;
	   }
	   public void printThrowException(){
	      System.out.println("Exception raised");
	      throw new IllegalArgumentException();
	   }
	}

