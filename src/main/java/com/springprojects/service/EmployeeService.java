/**
 * 
 */
package com.springprojects.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springprojects.dto.EmployeeVO;

/**
 * @author Suraj
 *
 */
@Component
public interface EmployeeService {

	public String saveEmployeeInformation(EmployeeVO employee)throws Exception;
	
	public List<EmployeeVO> getEmployeeInformation()throws Exception;
	
	public EmployeeVO getEmployeeInformationById(Integer  id)throws Exception;
	
	public List<EmployeeVO> getEmployeeInformationByName(String name)throws Exception;
	
}
