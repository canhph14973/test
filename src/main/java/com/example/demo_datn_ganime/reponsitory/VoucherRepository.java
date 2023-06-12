package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoucherRepository extends JpaRepository<Voucher, Integer> {
}