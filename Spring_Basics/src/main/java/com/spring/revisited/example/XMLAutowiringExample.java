/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.revisited.bean.xml.TextEditor;

/**
 * @author Vishnu Garg
 * @created On Aug 4, 2018
 *
 */
public class XMLAutowiringExample {
	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("beans_autowiring.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      
	      //spellChecker bean id should be same as the name refrence in TextEditot
	      te.spellCheck();
	      //byName bean id should be same as property Name defined in text editot
	      //byType it will search for the class that is injected no need whether id and property name are same or not
	      // constructor same as by type
	 }
}

