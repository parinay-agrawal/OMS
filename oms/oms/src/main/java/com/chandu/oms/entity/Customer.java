package com.chandu.oms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "customer_code")
	private String customer_code;
	@Column(name = "email")
	private String email;

	public Customer() {
	}

	public Customer(String customer_code, String email) {

		this.customer_code = customer_code;
		this.email = email;
	}

	public String getCustomer_code() {
		return customer_code;
	}

	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customer_code=" + customer_code + ", email=" + email + "]";
	}
	


}
