/**
 * 
 */
package com.springprojects.controller;


import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springprojects.dto.EmployeeVO;
import com.springprojects.repo.EmployeeRepository;

/**
 * @author Suraj
 *
 */
@RestController
public class EmployeeController {
	
	public static final Logger log = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeRepository repository;
	
	@RequestMapping("/greet")
	public String Greetings(){
		log.info("Inside Greet Method");
		return "Hello User, Welcome to spring jpa repository practice project !!!";
	}
	
	@RequestMapping("/save/{id}/{name}/{dept}/{address}")
	public String saveEmployeeInformation(@PathVariable("id") Integer id,
			@PathVariable("name") String name,
			@PathVariable("dept") String dept, 
			@PathVariable("address") String address) {
		log.info("Inside saveEmployeeInformation Controller Method");
		EmployeeVO employeeVO = new EmployeeVO(id,name,dept,address);		
		repository.save(employeeVO);
		return "Employee Information Stored Successfully !!!";
	}
}
