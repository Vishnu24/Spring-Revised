/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.revisited.aop.aspect.Student;

/**
 * @author Vishnu Garg
 * @created On Aug 5, 2018
 *
 */
public class AOPAspectExample {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("op_aspect.xml");
	      
	      Student student = (Student) context.getBean("student");
	      student.getName();
	      student.getAge();
	      
	      student.printThrowException();
	   }
}

