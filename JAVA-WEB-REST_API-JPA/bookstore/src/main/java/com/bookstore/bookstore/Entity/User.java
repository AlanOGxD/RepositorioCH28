package com.bookstore.bookstore.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="user")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id", unique=true, nullable=false)
	private Long user_id;
	
	@Column(nullable=false)
	private String username;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false)
	private String rol;
	
	private User () {
		
	}
	
	
	// Nueva anotacion para tabla pivote
	@OneToMany(mappedBy="user")
	@JsonManagedReference(value="user-order")
	private List<UserHasBook> userBooks;
	
	
	// Anotaciones para tabla pivote directa
//	@ManyToMany
//	@JoinTable(
//			name="User_has_Book",
//			joinColumns = @JoinColumn(name="User_user_id"),
//			inverseJoinColumns = @JoinColumn(name="Book_book_id")
//	)
	//private List<Book> books;

	

	public Long getUser_id() {
		return user_id;
	}

	public List<UserHasBook> getUserBooks() {
		return userBooks;
	}

	public void setUserBooks(List<UserHasBook> userBooks) {
		this.userBooks = userBooks;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

//	public List<Book> getBooks() {
//		return books;
//	}
//
//	public void setBooks(List<Book> books) {
//		this.books = books;
//	}
	

}
