package com.luv2code.springdemo.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired 
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCutomers() {
		Session currentSession=sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery=
			currentSession.createQuery("from Customer order by firstName", Customer.class);
		List<Customer> theCustomers=theQuery.getResultList();
		return theCustomers;
	}

	@Override
	public void saveCutomer(Customer theCustomer) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCutomer(int theId) {
		Session currentSession=sessionFactory.getCurrentSession();
		Customer theCustomer=currentSession.getReference(Customer.class, theId);
		return theCustomer;
	}

	@Override
	public void deleteCutomer(int theId) {
		Session currentSession=sessionFactory.getCurrentSession();
		Customer theCustomer=currentSession.getReference(Customer.class, theId);
		currentSession.delete(theCustomer);
	}

}
