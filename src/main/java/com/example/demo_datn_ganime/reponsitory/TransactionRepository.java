package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}