/**
 * 
 */
package com.springprojects.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springprojects.dto.EmployeeVO;

/**
 * @author Suraj
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeVO, Integer>  {
	
	@Query(value = "select * from Employee e where LOWER(e.name) = LOWER(:ename)", nativeQuery = true)
	public List<EmployeeVO> findByName(@Param("ename") String ename);

}
