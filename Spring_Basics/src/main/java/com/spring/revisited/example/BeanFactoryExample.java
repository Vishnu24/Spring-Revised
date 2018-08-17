/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.example;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.revisited.xml.aop.SampleService;

/**
 * @author Vishnu Garg
 * @created On Aug 4, 2018
 *
 */
public class BeanFactoryExample {
	public static void main(String[] args) {
		xmlBeanFactory();
	}

	private static void classsPathApplicationContext() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("aop_example.xml");
		SampleService sampleService = (SampleService) context.getBean("sampleServiceProxy");
		sampleService.printDetails();

		context.close();
	}

	private static void xmlBeanFactory() {

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("aop_example.xml"));
		// ConfigurableApplicationContext context = new
		// ClassPathXmlApplicationContext("aop_example.xml");
		SampleService sampleService = (SampleService) factory.getBean("sampleServiceProxy");
		sampleService.printDetails();

	}
}
