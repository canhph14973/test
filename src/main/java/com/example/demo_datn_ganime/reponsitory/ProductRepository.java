package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}