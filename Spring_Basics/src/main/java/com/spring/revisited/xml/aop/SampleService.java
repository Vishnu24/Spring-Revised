/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.xml.aop;

/**
 * @author Vishnu Garg
 * @created On May 2, 2018
 *
 */
public class SampleService {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void printDetails() {
		System.out.println("AOPAdvice : Method printDetails() : My name is " + name + "         and my id is " + id);
	}

	public void checkName() {
		if (name.length() < 15) {
			throw new IllegalArgumentException();
		}
	}

	public void sayHello(String message) {
		System.out.println("AOPAdvice : Method sayHello() : Hello.. " + message);
	}
}
