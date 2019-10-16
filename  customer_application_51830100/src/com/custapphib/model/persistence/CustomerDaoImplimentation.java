package com.custapphib.model.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class CustomerDaoImplimentation implements CustomerDao {
	@Autowired
	private SessionFactory factory;
	private Session getSession(){
		return factory.getCurrentSession();
		
	}
	@Override
	public List<Customer> getAllCustomer() {
		 return getSession().createQuery("from Customer").list();
	}
	@Override
	public Customer getCustomerById(int custId) {
		return (Customer)getSession().get(Customer.class,custId);
	}
	@Override
	public Customer addCustomer(Customer customer) {
		getSession().save(customer);
		return customer;
		
	}
	@Override
	public Customer updateCustomer(Customer customer) {
		getSession().update(customer);		
		return customer;
	}
	@Override
	public Customer removeCustomer(int custId) {
		Customer custtobedeleted=null;
		custtobedeleted=getCustomerById(custId);
		getSession().delete(custtobedeleted);
		
	
	return custtobedeleted;
	}
	
	
	

	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
