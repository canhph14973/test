package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}