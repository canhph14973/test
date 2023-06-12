package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
}