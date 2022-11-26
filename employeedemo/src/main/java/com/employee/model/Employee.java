package com.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	
	private int empid;
	@NotBlank(message="empname should not be blank")
	private String empname;
	@NotNull(message="empsal should not null")
	private Double empsal;
	@NotBlank(message="empcity should not be blank")
	private String empcity;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, int empid, String empname, Double empsal, String empcity) {
		super();
		this.id = id;
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empcity = empcity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	public String getEmpcity() {
		return empcity;
	}
	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empcity="
				+ empcity + "]";
	}
	
	
	
	

}
