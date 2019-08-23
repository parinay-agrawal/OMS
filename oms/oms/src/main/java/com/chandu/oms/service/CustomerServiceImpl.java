package com.chandu.oms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.oms.entity.Customer;
import com.chandu.oms.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Iterable<Customer> displayCust() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	

	

}
