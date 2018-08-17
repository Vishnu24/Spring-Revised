/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.revisited.xml.aop.SampleService;

/**
 * @author Vishnu Garg
 * @created On Aug 3, 2018
 *
 */
public class AOPExample {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("aop_example.xml");
        SampleService sampleService = (SampleService) context.getBean("sampleServiceProxy");
        
        sampleService.printDetails();
        try{
            sampleService.checkName();
        } catch(Exception e){
            System.out.println("SampleService: Method checkName() thrown exception");
        }
        sampleService.sayHello("JavaTutorials");
        context.close();
	}
}

