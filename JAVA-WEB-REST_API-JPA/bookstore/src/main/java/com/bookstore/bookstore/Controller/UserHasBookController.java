package com.bookstore.bookstore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookstore.Entity.OrderRequest;
import com.bookstore.bookstore.Entity.UserHasBook;
import com.bookstore.bookstore.Service.UserHasBookService;

@RestController
@RequestMapping("/bookstore/orders")
public class UserHasBookController {
	
	private final UserHasBookService userHasBookService;
	
	@Autowired
	public UserHasBookController(UserHasBookService userBookService) {
		this.userHasBookService = userBookService;
	}
	
	// OrderRequest es un DTO
	// Data Transfer Object, solamente se utilizan para el proceso de transferencias
	@PostMapping
	public UserHasBook createOrder(@RequestBody OrderRequest orderRequest) {
		return userHasBookService.createOrder(orderRequest);
	}
}
