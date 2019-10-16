package com.custapphib.service;

import java.util.List;

import com.custapphib.model.persistence.Customer;

public interface CustomerService {
	public List<Customer>getAllCustomer();
	public Customer getCustomerById(int custId);
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer removeCustomer(int custId);
}
