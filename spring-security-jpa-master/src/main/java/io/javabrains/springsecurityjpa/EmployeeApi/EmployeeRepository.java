package io.javabrains.springsecurityjpa.EmployeeApi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	@Query(value="SELECT * FROM employee e WHERE CONCAT(e.employee_id, ' ', e.name, ' ', e.phone_number, ' ', e.supervisors) LIKE %?1%", nativeQuery = true)
	public List<Employee> search(String keyword); // Search Filter
}
