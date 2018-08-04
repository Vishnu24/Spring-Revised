/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.model;

/**
 * @author Vishnu Garg
 * @created On Aug 3, 2018
 *
 */
public class Employee {

	private String name;
	
	public String getName() {
		return name;
	}

	//@Loggable
	public void setName(String nm) {
		this.name=nm;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}	
}

