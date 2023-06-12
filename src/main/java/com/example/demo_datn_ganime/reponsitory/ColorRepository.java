package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color, Integer> {
}