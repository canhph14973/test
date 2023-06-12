package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<Exchange, Integer> {
}