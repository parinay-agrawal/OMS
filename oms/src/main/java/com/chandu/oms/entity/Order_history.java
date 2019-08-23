package com.chandu.oms.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="order_history")
public class Order_history {
@Id
@Column(name="order_no")	
private String order_no;
@Column(name="quantity_traded")
private double quantity_traded;
@Column(name="price")
private double price;
@Column(name="direction")
private String direction;
@Column(name="linked_order_number")
private String linked_order_number;
public Order_history() {}
public Order_history(String order_no, double quantity_traded, double price, String direction,
		String linked_order_number) {
	
	this.order_no = order_no;
	this.quantity_traded = quantity_traded;
	this.price = price;
	this.direction = direction;
	this.linked_order_number = linked_order_number;
}
public String getOrder_no() {
	return order_no;
}
public void setOrder_no(String order_no) {
	this.order_no = order_no;
}
public double getQuantity_traded() {
	return quantity_traded;
}
public void setQuantity_traded(double quantity_traded) {
	this.quantity_traded = quantity_traded;
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
public String getLinked_order_number() {
	return linked_order_number;
}
public void setLinked_order_number(String linked_order_number) {
	this.linked_order_number = linked_order_number;
}
@Override
public String toString() {
	return "Order_history [order_no=" + order_no + ", quantity_traded=" + quantity_traded + ", price=" + price
			+ ", direction=" + direction + ", linked_order_number=" + linked_order_number + "]";
}

}
