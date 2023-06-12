package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.ProductSize;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSizeRepository extends JpaRepository<ProductSize, Integer> {
}