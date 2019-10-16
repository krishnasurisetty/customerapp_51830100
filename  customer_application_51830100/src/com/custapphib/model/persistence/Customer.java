package com.custapphib.model.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "cust_table")
public class Customer {
	@Id
	@GeneratedValue
	private int id;

	@NotEmpty(message = "name can't left blank")
	private String name;

	@NotEmpty(message = "Address can't left blank")
	private String address;
	@NotNull(message = "mobile number can't be left blank")
	private String mobile;
	@Email
	@NotEmpty(message = "Email can't left blank")
	private String email;
	@NotNull(message = "salary number can't be left blank")
	private Double salary;
	private String employee;

	public Customer() {
		super();
	}

	public Customer(int id, String name, String address, String mobile, String email, Double salary, String employee) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.salary = salary;
		this.employee = employee;
	}

	public Customer(String name, String address, String mobile, String email, Double salary, String employee) {
		super();
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.salary = salary;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + ", email="
				+ email + ", salary=" + salary + ", employee=" + employee + "]";
	}

}