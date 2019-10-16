package com.custapphib.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.custapphib.model.persistence.Customer;
import com.custapphib.model.persistence.CustomerDao;

@Service(value = "cs")
@Transactional
public class CustomerServImpl implements CustomerService {
	@Autowired
	private CustomerDao dao;

	@Override
	public List<Customer> getAllCustomer() {
		return dao.getAllCustomer();
	}

	@Override
	public Customer getCustomerById(int custId) {
		Customer customer = dao.getCustomerById(custId);
		if (customer == null) {
			throw new CustomernotException("Customer with id:" + custId + "Customer is not found");

		}
		return customer;

	}

	@Override
	public Customer addCustomer(Customer customer) {

		return dao.addCustomer(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return dao.updateCustomer(customer);
	}

	@Override
	public Customer removeCustomer(int custId) {
		return dao.removeCustomer(custId);
	}

}
