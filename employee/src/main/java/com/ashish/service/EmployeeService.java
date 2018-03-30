/**
 * 
 */
package com.ashish.service;

import com.ashish.model.Employee;

/**
 * @author ashish
 *
 */
public interface EmployeeService {

	public boolean addEmployee(Employee employee);
	public Employee fetchEmployee(String id);
	public void updateEmployee(Employee employee);
	public boolean removeEmployee(String id);
	
}
