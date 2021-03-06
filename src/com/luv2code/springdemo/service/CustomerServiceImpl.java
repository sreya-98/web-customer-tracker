package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	//need to inject customer DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers = customerDAO.getCustomers();
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theId) {
		return customerDAO.getCustomer(theId);
	}

	@Override
	public void deleteCustomer(int theId) {
		customerDAO.deleteCustomer(theId);
		
	}

}
