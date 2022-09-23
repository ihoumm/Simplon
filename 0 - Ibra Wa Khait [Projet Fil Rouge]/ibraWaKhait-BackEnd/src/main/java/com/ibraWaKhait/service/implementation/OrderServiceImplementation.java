package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Order;
import com.ibraWaKhait.repository.OrderRepository;
import com.ibraWaKhait.service.OrderService;

public class OrderServiceImplementation implements OrderService {
	
	private OrderRepository orderRepository;

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return this.orderRepository.save(order);
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order getOrderById(long id) {
		// TODO Auto-generated method stub
		return this.orderRepository.findById(id).get();
	}

	@Override
	public Order updateOrder(Order order, long id) {
		Order existingOrder = orderRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("invoiceRepository", "id", id));
		
		existingOrder.setOrder_id(order.getOrder_id());
		existingOrder.setOrder_Date(order.getOrder_Date());
		existingOrder.setQuantity(order.getQuantity());
		existingOrder.setInserted_at(order.getInserted_at());
		existingOrder.setUpdated_at(order.getUpdated_at());
		
		orderRepository.save(existingOrder);
		
		return existingOrder;
	}

	@Override
	public void deleteOrderById(long id) {
		this.orderRepository.deleteById(id);
		
	}

}
