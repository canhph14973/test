package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}