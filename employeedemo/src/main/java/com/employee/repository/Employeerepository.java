package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;
@Repository
public interface Employeerepository extends JpaRepository<Employee,Integer> {
	@Query("select e from Employee e where e.empid=:empid")
	public Employee fetchEmployeee(int empid);

	
	

}
