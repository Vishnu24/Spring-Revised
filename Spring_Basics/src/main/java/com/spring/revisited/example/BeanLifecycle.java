/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.example;

import java.util.Calendar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.revisited.bean.xml.HelloWorld;

/**
 * @author Vishnu Garg
 * @created On Aug 4, 2018
 *
 */
public class BeanLifecycle {
	public static void main(String[] args) {
		
		Calendar calender=Calendar.getInstance();
		System.out.println(calender.getTimeInMillis());
		calender.setTimeInMillis(1533643138756l);
		System.out.println(calender.getTime());
		System.out.println("Strt");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Before ");
		HelloWorld bean = (HelloWorld) ctx.getBean("helloWorld");
		ctx.close();
	}
}
