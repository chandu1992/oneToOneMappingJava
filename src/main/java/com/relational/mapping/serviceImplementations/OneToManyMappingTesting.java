package com.relational.mapping.serviceImplementations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relational.mapping.oneToMany.entity.Customer;
import com.relational.mapping.oneToMany.entity.Order;
import com.relational.mapping.repositories.CustomerRepo;

@Service
public class OneToManyMappingTesting {
	
	@Autowired
	CustomerRepo customerRepo;
	

	public void saveDataToCustomerOrder() {
		// TODO Auto-generated method stub
		
		Customer cust = new Customer();
		
		cust.setCustId(111);
		cust.setName("Gauri Pande");
		cust.setAddress("Ravet, Pune pin 2626");
		
		Order o1 = new Order();
		o1.setOrderId(1);
		o1.setDescription("chicken curry");
		o1.setCustInfo(cust);
		
		Order o2 = new Order();
		o2.setOrderId(2);
		o2.setDescription("Veg curry");
		
		List<Order> orderList = new ArrayList<>();
		orderList.add(o1);
		orderList.add(o2);
		o2.setCustInfo(cust);
		
		cust.setOrders(orderList);
		
		customerRepo.save(cust);
		
		
	}

	public void readDataToCustomerOrder() {
		// TODO Auto-generated method stub
		
		Customer customer = customerRepo.findById((long) 111).get();
		
		System.out.println(customer.getName()+ ":");
		
		for(Order o:customer.getOrders()) {
			System.out.println(o.getDescription());
		}
		
		
	}

	
}
