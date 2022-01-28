package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;//czemu interface 

	@Override
	@Transactional 
	public List<Customer> getCustomers() {
		return customerDAO.getCutomers();
	}

	@Override
	@Transactional 
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCutomer(theCustomer);
		
	}

	@Override
	@Transactional 
	public Customer getCustomer(int theId) {
		return customerDAO.getCutomer(theId);
	}

	@Override
	@Transactional 
	public void deleteCustomer(int theId) {
		customerDAO.deleteCutomer(theId);
		
	}

	
}
