package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Integer> {
}