/**
 * 
 */
package com.springprojects.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springprojects.dto.EmployeeVO;

/**
 * @author Suraj
 *
 */
public interface EmployeeRepository extends JpaRepository<EmployeeVO, Integer>  {

}
