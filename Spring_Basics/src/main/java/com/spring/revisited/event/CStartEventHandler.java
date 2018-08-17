/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @author Vishnu Garg
 * @created On May 3, 2018
 *
 */
/**
 * @author Vishnu
 *
 */
public class CStartEventHandler implements  ApplicationListener<ContextStartedEvent>{
	
	 public void onApplicationEvent(ContextStartedEvent event) {
	      System.out.println("ContextStartedEvent Received");
	   }
}

