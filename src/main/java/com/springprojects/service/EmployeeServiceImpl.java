/**
 * 
 */
package com.springprojects.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprojects.dto.EmployeeVO;
import com.springprojects.repo.EmployeeRepository;

/**
 * @author Suraj
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public String saveEmployeeInformation(EmployeeVO employee) throws Exception {
		repository.save(employee);
		return "Employee Information Stored Successfully !!!";
	}
	
	@Override
	public List<EmployeeVO> getEmployeeInformation()throws Exception{
		List<EmployeeVO> employeeVO = repository.findAll();
		return employeeVO;
	}
	
	@Override
	public EmployeeVO getEmployeeInformationById(Integer  id)throws Exception {
		EmployeeVO employeeVO = repository.findById(id)
				.orElseThrow(()-> new RuntimeException());
		return employeeVO;
	}

	@Override
	public List<EmployeeVO> getEmployeeInformationByName(String name) throws Exception {
		List<EmployeeVO> employeeVO = repository.findByName(name);
		return employeeVO;
	}

}
