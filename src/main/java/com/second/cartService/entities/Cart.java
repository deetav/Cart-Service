package com.second.cartService.entities;


import jakarta.persistence.*;

import java.util.List;

// use this class to create tables in the database
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;
    @Column(nullable = false, unique = true)
    private int customerName;

    @OneToMany(mappedBy = "cart")
    private List<Item> items;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getCustomerName() {
        return customerName;
    }

    public void setCustomerName(int customerName) {
        this.customerName = customerName;
    }
}
