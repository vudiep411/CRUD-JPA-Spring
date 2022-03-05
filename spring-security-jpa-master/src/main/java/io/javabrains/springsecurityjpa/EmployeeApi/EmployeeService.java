package io.javabrains.springsecurityjpa.EmployeeApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	// List All with filter
	public List<Employee> listAll(String keyword)
	{
		if (keyword != null) 
		{
			return repo.search(keyword);
		}
		return repo.findAll();
	}
	
	// save method
	public void save(Employee e) 
	{
		repo.save(e);
	}
	
	// find employee by id
	public Optional<Employee> get(int id) 
	{
		return repo.findById(id);
	}
	
	// delete employee
	public void delete(int id)
	{
		repo.deleteById(id);
	}
}
