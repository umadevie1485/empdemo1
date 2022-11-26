package com.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.Employeerepository;

import java.util.List;

@Service
public class Employeeservice {
	@Autowired
	private Employeerepository emprepo;

	public Employee save(Employee emp) {
		return emprepo.save(emp);
	}

	public Optional<Employee> get(int empid) {
		return emprepo.findById(empid);
	}

	public java.util.List<Employee> getAll() {
		return emprepo.findAll();

	}

	public void delete(int empid) {
		emprepo.deleteById(empid);

	}

	public Employee update(Employee emp) {
		Employee dbEmployee = emprepo.fetchEmployeee(emp.getEmpid());
		if (dbEmployee != null) {
			if (emp.getEmpname() != null && !emp.getEmpname().isEmpty()) {
				dbEmployee.setEmpname(emp.getEmpname());
			}

			if (emp.getEmpcity() != null && !emp.getEmpcity().isEmpty()) {
				dbEmployee.setEmpcity(emp.getEmpcity());
			}
			if (emp.getEmpsal() != null) {
				dbEmployee.setEmpsal(emp.getEmpsal());
			}
			return emprepo.save(dbEmployee);
		} else {
			return emprepo.save(emp);
		}
		
	}
}
