/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.aop.proxy;

/**
 * @author Vishnu Garg
 * @created On Aug 3, 2018
 *
 */
public class SamplePojo implements Pojo {
	public void foo() {
		System.out.println(" Strt Pojo foo");
		this.bar();
		System.out.println(" End Pojo foo");
	}

	public void bar() {

		// some logic...
		System.out.println(" IN Pojo Bar");

	}
}
