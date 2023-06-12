package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<Promotion, Integer> {
}