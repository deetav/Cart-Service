package com.second.cartService.daos;

import com.second.cartService.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be used to do crud operations with the databases
public interface ItemDao extends JpaRepository<Item, Integer> {

}
