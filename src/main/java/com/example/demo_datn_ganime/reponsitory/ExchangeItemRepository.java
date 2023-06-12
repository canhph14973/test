package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.ExchangeItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeItemRepository extends JpaRepository<ExchangeItem, Integer> {
}