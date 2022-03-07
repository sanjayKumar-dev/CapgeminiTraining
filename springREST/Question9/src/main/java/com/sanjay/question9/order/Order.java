package com.sanjay.question9.order;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sanjay.question9.customer.Customer;
import com.sanjay.question9.lineitem.LineItem;

@Document("order")
public class Order {
	@Id
	private int id;
	private float total;
	private Date date;
	private Customer customer;
	private List<LineItem> lineItem;
	
	
	public Order(int id, float total, Date date, Customer customer, List<LineItem> lineItem) {
		super();
		this.id = id;
		this.total = total;
		this.date = date;
		this.customer = customer;
		this.lineItem = lineItem;
	}
	public Order() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<LineItem> getLineItem() {
		return lineItem;
	}
	public void setLineItem(List<LineItem> lineItem) {
		this.lineItem = lineItem;
	}
	
	

}
