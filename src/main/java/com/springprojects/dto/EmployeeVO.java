/**
 * 
 */
package com.springprojects.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Suraj
 *
 */

@Entity
@Table(name="Employee")
public class EmployeeVO {
	
	@Id
	@Column(name="id")
	private Integer employeeId;	
	
	@Column(name="name")
	private String employeeName;
	
	@Column(name="department")
	private String department;
	
	@Column(name="address")
	private String address;
	
	public EmployeeVO() {}

	public EmployeeVO(Integer employeeId, String employeeName, String department, String address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeVO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ ", address=" + address + "]";
	}
	
	
}
