package io.javabrains.springsecurityjpa.EmployeeApi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")

public class Employee {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int employee_id;

	@Column(name = "NAME", length = 45)
	private String name;
	
	@Column(name = "PHONE_NUMBER", length = 45)
	private String phone_number;
	
	@Column(name = "SUPERVISORS", length = 45)
	private String supervisors;
	
	// Constructors
	public Employee(){}
	
	public Employee(int employee_id, String name, String phone_number, String supervisors) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.phone_number = phone_number;
		this.supervisors = supervisors;
	}
	
	
	// Setters And Getters
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getSupervisors() {
		return supervisors;
	}

	public void setSupervisors(String supervisors) {
		this.supervisors = supervisors;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", name=" + name + ", phone_number=" + phone_number
				+ ", supervisors=" + supervisors + "]";
	}

	
	

	
	
	
}
