/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.bean.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.revisited.bean.xml.HelloWorld;

/**
 * @author Vishnu Garg
 * @created On Aug 4, 2018
 *
 */
public class Example {

	public static void main(String[] a) {
		ApplicationContext configContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = configContext.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
		
		
	}
}
