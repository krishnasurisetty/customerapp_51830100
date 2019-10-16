package com.custapphib.model.persistence;

import java.util.List;

public interface CustomerDao {
	public List<Customer> getAllCustomer();

	public Customer getCustomerById(int custId);

	public Customer addCustomer(Customer customer);

	public Customer updateCustomer(Customer customer);

	public Customer removeCustomer(int custId);

}
