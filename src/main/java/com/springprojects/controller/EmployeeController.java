/**
 * 
 */
package com.springprojects.controller;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springprojects.dto.EmployeeVO;
import com.springprojects.service.EmployeeService;

/**
 * @author Suraj
 *
 */

@RestController
public class EmployeeController {

	public static final Logger log = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/greet")
	public String Greetings() {
		log.info("Inside Greet Method");
		return "Hello User, Welcome to spring jpa repository practice project !!!";
	}

	@RequestMapping("/save/{id}/{name}/{dept}/{address}")
	public String saveEmployeeInformation(@PathVariable("id") Integer id, @PathVariable("name") String name,
			@PathVariable("dept") String dept, @PathVariable("address") String address) {
		log.info("Inside saveEmployeeInformation Controller Method");
		EmployeeVO employeeVO = new EmployeeVO(id, name, dept, address);
		String response = null;
		try {
			response = employeeService.saveEmployeeInformation(employeeVO);
		} catch (Exception e) {
			log.info("Exception While Saving Employee Information: " + e.getMessage());
			throw new RuntimeException();
		}
		return response;
	}

	@RequestMapping("/findAll")
	public List<EmployeeVO> getEmployeeInformation() {
		List<EmployeeVO> employeeVOs = new ArrayList<>();
		try {
			log.info("Inside getEmployeeInformation Method");
			employeeVOs = employeeService.getEmployeeInformation();
		} catch (Exception e) {
			log.info("Exception While Gettting Employee Information: " + e.getMessage());
			throw new RuntimeException();
		}
		return employeeVOs;
	}
	
	@RequestMapping("/findById/{id}")
	public EmployeeVO getEmployeeInformationById(@PathVariable("id") Integer id) {
		EmployeeVO employeeVO = new EmployeeVO();
		try {
			log.info("Inside getEmployeeInformationById Method");
			employeeVO = employeeService.getEmployeeInformationById(id);
		} catch (Exception e) {
			log.info("Exception While Gettting Employee Information: " + e.getMessage());
			throw new RuntimeException();
		}
		return employeeVO;
	}
	
	@RequestMapping("/findByName/{name}")
	public List<EmployeeVO> getEmployeeInformationByName(@PathVariable("name") String name) {
		List<EmployeeVO> employeeVOs = new ArrayList<>();
		try {
			log.info("Inside getEmployeeInformationByName Method");
			employeeVOs = employeeService.getEmployeeInformationByName(name);
		} catch (Exception e) {
			log.info("Exception While Gettting Employee Information: " + e.getMessage());
			throw new RuntimeException();
		}
		return employeeVOs;
	}
}
