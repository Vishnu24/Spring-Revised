/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @author Vishnu Garg
 * @created On May 3, 2018
 *
 */
public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent>{

	   public void onApplicationEvent(ContextStoppedEvent event) {
	      System.out.println("ContextStoppedEvent Received");
	   }
}

