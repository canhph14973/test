package com.example.demo_datn_ganime.reponsitory;

import com.example.demo_datn_ganime.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}