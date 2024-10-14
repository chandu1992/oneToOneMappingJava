package com.relational.mapping.oneToMany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_order")
public class Order {

	@Id
	private long orderId;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer custInfo;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Order(long orderId, String description, Customer custInfo) {
		super();
		this.orderId = orderId;
		this.description = description;
		this.custInfo = custInfo;
	}



	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public Customer getCustInfo() {
		return custInfo;
	}

	public void setCustInfo(Customer custInfo) {
		this.custInfo = custInfo;
	}



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", description=" + description + ", custInfo=" + custInfo + "]";
	}

	

}
