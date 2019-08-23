package com.chandu.oms.entity;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name="order_book")
public class Order_book {
@Id
@Column(name="order_no")
private String order_no;
@ManyToOne
@JoinColumn(name="security_code")
private Security_master security_master;
@Column(name="datetime")
LocalDateTime datetime;
@Column(name="price")
private double price;
@Column(name="direction")
private String direction;
@Column(name="quantity")
private double quantity;
@Column(name="order_status")
private String order_status;
@Column(name="price_condition")
private String price_condition;
@ManyToOne
@JoinColumn(name="customer_code")
private Customer customer;

	public Order_book() {

	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public Security_master getSecurity_master() {
		return security_master;
	}

	public void setSecurity_master(Security_master security_master) {
		this.security_master = security_master;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getPrice_condition() {
		return price_condition;
	}

	public void setPrice_condition(String price_condition) {
		this.price_condition = price_condition;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
