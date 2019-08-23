package com.chandu.oms.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chandu.oms.entity.Customer;
@Repository
public interface CustomerService {
	Iterable<Customer> displayCust();
}
