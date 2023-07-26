package com.bookstore.bookstore.Entity;


// DTO
public class OrderRequest {
	
	private Long user_id;
	private Long book_id;
	private int quantity;
	private int order_id;
	
	
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getBook_id() {
		return book_id;
	}
	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	

	

	
}
