package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCutomers();

	public void saveCutomer(Customer theCustomer);

	public Customer getCutomer(int theId);

	public void deleteCutomer(int theId);

	public List<Customer> searchCustomers(String theSearchName);

}
