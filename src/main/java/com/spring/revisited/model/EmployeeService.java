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
public class EmployeeService {
	
		private Employee employee;
		
		public Employee getEmployee(){
			return this.employee;
		}
		
		public void setEmployee(Employee e){
			this.employee=e;
		}
	
}

