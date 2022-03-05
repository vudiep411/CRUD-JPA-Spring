package io.javabrains.springsecurityjpa.EmployeeApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	// Home
	@RequestMapping("/")
	public String home(Model model, @Param("keyword") String keyword) 
	{
		List<Employee> e = service.listAll(keyword);
		model.addAttribute("listEmployee", e);
		model.addAttribute("keyword", keyword);
		return "index";
	}
	
	// CREATE
	@GetMapping("/addForm")
	public String addForm(Model m)
	{
		Employee e = new Employee();
		m.addAttribute("employee", e);
		return "AddEmployee";
	}
	
	// SAVE
	@PostMapping(value = "/addEmployee")
	public String addEmployee(@ModelAttribute("employee") Employee e)
	{
		service.save(e);
		return "redirect:/";
	}
	
	
	// UPDATE
	@GetMapping("Update/{id}")
	public String update(@PathVariable(value = "id") int id, Model m)
	{
		Optional<Employee> e = service.get(id);
		m.addAttribute("employee", e);
		return "UpdateForm";
	}
	
	
	// DELETE
	@GetMapping("deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") int id)
	{
		service.delete(id);
		return "redirect:/";
	}
	
}
