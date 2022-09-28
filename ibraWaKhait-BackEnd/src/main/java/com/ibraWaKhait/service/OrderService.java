package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Order;

public interface OrderService {
	
	
	Order addOrder(Order order);
	
	List<Order> getAllOrders();
	
	Order getOrderById(long id);
	
	Order updateOrder(Order order, long id);

	void deleteOrderById(long id);
	
	
}
