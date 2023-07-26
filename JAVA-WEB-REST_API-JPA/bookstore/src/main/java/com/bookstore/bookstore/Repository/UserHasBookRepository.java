package com.bookstore.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.bookstore.Entity.UserHasBook;

public interface UserHasBookRepository extends JpaRepository<UserHasBook, Long> {

}
