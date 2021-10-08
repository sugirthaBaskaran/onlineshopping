package com.edubridge.onlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.onlineshop.entities.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}