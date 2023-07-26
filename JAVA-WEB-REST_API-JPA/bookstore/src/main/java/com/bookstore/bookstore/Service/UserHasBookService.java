package com.bookstore.bookstore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.Entity.Book;
import com.bookstore.bookstore.Entity.OrderRequest;
import com.bookstore.bookstore.Entity.User;
import com.bookstore.bookstore.Entity.UserHasBook;
import com.bookstore.bookstore.Repository.BookRepository;
import com.bookstore.bookstore.Repository.UserHasBookRepository;
import com.bookstore.bookstore.Repository.UserRepository;

@Service
public class UserHasBookService {
	
	private final UserHasBookRepository userHasBookRepository;
	private final UserRepository userRepository;
	private final BookRepository bookRepository;
	
	
	@Autowired
	public UserHasBookService(UserHasBookRepository userHasBookRepository, UserRepository userRepository,
			BookRepository bookRepository) {
		this.userHasBookRepository = userHasBookRepository;
		this.userRepository = userRepository;
		this.bookRepository = bookRepository;
	}
	
	// POST METHOD
	public UserHasBook createOrder(OrderRequest orderRequest) {
		
		// Get data from users and save them
		Long user_id = orderRequest.getUser_id();
		Long book_id = orderRequest.getBook_id();
		int quantity = orderRequest.getQuantity();
	    int order_id = orderRequest.getOrder_id(); 
		
		User persistentUser = userRepository.findById(user_id).orElse(null);
		Book persistentBook = bookRepository.findById(book_id).orElse(null);
		
		// Construct and populate a new UserHasBook instance
		UserHasBook userHasBook = new UserHasBook();
		
		userHasBook.setUser(persistentUser);
		userHasBook.setBook(persistentBook);
		userHasBook.setQuantity(quantity);
		userHasBook.setOrder_id(order_id);
		
		// save it
		return userHasBookRepository.save(userHasBook);
	}
}
