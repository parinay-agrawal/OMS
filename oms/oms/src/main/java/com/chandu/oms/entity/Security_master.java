package com.chandu.oms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="security_master")
public class Security_master {
 @Id
 @Column(name="security_code")
 private String security_code;
 @Column(name="company_name")
 private String company_name;
 @Column(name="security_price")
 private String security_price;

 public Security_master() {}
public Security_master(String security_code, String company_name, String security_price) {
	
	this.security_code = security_code;
	this.company_name = company_name;
	this.security_price = security_price;
	
}
public String getSecurity_code() {
	return security_code;
}
public void setSecurity_code(String security_code) {
	this.security_code = security_code;
}
public String getCompany_name() {
	return company_name;
}
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}
public String getSecurity_price() {
	return security_price;
}
public void setSecurity_price(String security_price) {
	this.security_price = security_price;
}

@Override
public String toString() {
	return "Security_master [security_code=" + security_code + ", company_name=" + company_name + ", security_price="
			+ security_price +  "]";
}
 
}
