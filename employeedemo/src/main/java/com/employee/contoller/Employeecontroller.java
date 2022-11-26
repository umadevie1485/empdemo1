package com.employee.contoller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.Employeeservice;

@RestController
public class Employeecontroller {
	
	@Autowired
	private Employeeservice empser;
	
	@PostMapping("/save")
	public Employee save(@RequestBody @Valid Employee emp) {
		return  empser.save(emp);
	}
    @GetMapping("/get/{id}")
	public Optional<Employee> get(@PathVariable int id) {
		return  empser.get(id);
	}
    @GetMapping("/getAll")
	public java.util.List<Employee> getEmployees() {
		return empser.getAll();

	}
    @DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		 empser.delete(id);

	}
    @PutMapping("/update")
	public Employee update(@RequestBody Employee emp) {
		return empser.update(emp);

	
	
	
    }	

}
