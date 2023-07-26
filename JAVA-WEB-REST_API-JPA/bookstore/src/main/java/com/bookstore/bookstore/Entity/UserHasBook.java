package com.bookstore.bookstore.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="user_has_book")
public class UserHasBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_buy_books_id")
	private Long userBuyBooksId;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="order_id")
	private int order_id;
	
	// Si algun user se modifica, tambien se modificará aquí
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="User_user_id", nullable=false)
	@JsonBackReference(value="user-order") // Anotacion para controlar peticiones hacia esta entidad
	private User user;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="Book_book_id", nullable=false)
	@JsonBackReference(value="user-order")
	private Book book;

	public UserHasBook() {
		super();
	}

	public Long getUserBuyBooksId() {
		return userBuyBooksId;
	}

	public void setUserBuyBooksId(Long userBuyBooksId) {
		this.userBuyBooksId = userBuyBooksId;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	

}
