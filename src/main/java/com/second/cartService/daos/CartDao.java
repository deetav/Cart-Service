package com.second.cartService.daos;

import com.second.cartService.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

// This will help us do the crud operations with the database

public interface CartDao extends JpaRepository<Cart, Integer> {

}
