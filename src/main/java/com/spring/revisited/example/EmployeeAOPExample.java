/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.revisited.model.EmployeeService;

/**
 * @author Vishnu Garg
 * @created On Aug 3, 2018
 *
 */
public class EmployeeAOPExample {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("employee_aop.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Pankaj");
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}

}

