package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}