package com.second.cartService.entities;


import jakarta.persistence.*;

// use this class to create tables in the database
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;
    @Column(nullable = false, unique = true)
    private int customerName;

}
