package com.ibraWaKhait.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibraWaKhait.model.Order;
import com.ibraWaKhait.service.OrderService;

public class OrderController {

	private OrderService orderService;

	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}

	// build create Order REST API
	@PostMapping
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.addOrder(order), HttpStatus.CREATED);
	}

	// build get all Order REST API
	@GetMapping
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}

	// build get Order by id REST API
	// http://localhost:8080/api/order/1
	@GetMapping("{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable("id") long order_id) {
		return new ResponseEntity<Order>(orderService.getOrderById(order_id), HttpStatus.OK);
	}

	// build update Order REST API
	// http://localhost:8080/api/order/1
	@PutMapping("{id}")
	public ResponseEntity<Order> updateOrder(@PathVariable("id") long id, @RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.updateOrder(order, id), HttpStatus.OK);
	}

	// build delete Order REST API
	// http://localhost:8080/api/order/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteOrder(@PathVariable("id") long id) {

		// delete Order from DB
		orderService.deleteOrderById(id);

		return new ResponseEntity<String>("Order deleted successfully!.", HttpStatus.OK);
	}

}
