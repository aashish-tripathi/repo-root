/**
 * 
 */
package com.ashish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.model.Employee;
import com.ashish.service.EmployeeService;

/**
 * @author ashish
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/add")
	public Boolean addEmployee(Employee employee) {
		
        return empService.addEmployee(employee);
    }
	
	@RequestMapping("/get")
	public Employee getEmployee(String id) {
        return empService.fetchEmployee(id);
    }
	
	@RequestMapping("/update")
	public void updateEmployee(Employee employee) {
		empService.updateEmployee(employee);
    }
	
	@RequestMapping("/delete")
	public Boolean deleteEmployee(String id) {
		
        return empService.removeEmployee(id);
    }
	
}
