package com.chandu.oms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.chandu.oms.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long>{
//@Query("select * from customer")
//List<Customer> displayCust();
}
