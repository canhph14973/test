package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}