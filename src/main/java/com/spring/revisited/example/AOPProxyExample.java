/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.example;

import org.springframework.aop.framework.ProxyFactory;

import com.spring.revisited.aop.proxy.Pojo;
import com.spring.revisited.aop.proxy.SamplePojo;
import com.spring.revisited.xml.aop.BeforeMethod;


/**
 * @author Vishnu Garg
 * @created On Aug 3, 2018
 *
 */
public class AOPProxyExample {
	public static void main(String[] args) {

		ProxyFactory factory = new ProxyFactory(new SamplePojo());

		factory.addInterface(Pojo.class);

		// Advice is being added here
		factory.addAdvice(new BeforeMethod());

		Pojo pojo = (Pojo) factory.getProxy();

		pojo.foo();

	}
}
