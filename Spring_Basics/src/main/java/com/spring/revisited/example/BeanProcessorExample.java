/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.revisited.bean.xml.HelloWorld;

/**
 * @author Vishnu Garg
 * @created On Aug 4, 2018
 *
 */
public class BeanProcessorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		 context.start();
		  HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      context.stop();
	      context.registerShutdownHook();
	}

}

