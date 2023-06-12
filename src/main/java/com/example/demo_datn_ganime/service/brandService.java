package com.example.demo_datn_ganime.service;

import com.example.demo_datn_ganime.entity.Brand;
import com.example.demo_datn_ganime.reponsitory.BrandRepository;
import com.example.demo_datn_ganime.serviceImp.brandServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class brandService implements brandServiceImp {
    @Autowired
    BrandRepository brandRepository;

    @Override
    public <S extends Brand> List<S> saveAll(Iterable<S> entities) {
        return brandRepository.saveAll(entities);
    }

    @Override
    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    @Override
    public List<Brand> findAllById(Iterable<Integer> integers) {
        return brandRepository.findAllById(integers);
    }

    @Override
    public <S extends Brand> S save(S entity) {
        return brandRepository.save(entity);
    }

    @Override
    public Optional<Brand> findById(Integer integer) {
        return brandRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return brandRepository.existsById(integer);
    }

    @Override
    public long count() {
        return brandRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        brandRepository.deleteById(integer);
    }

    @Override
    public void delete(Brand entity) {
        brandRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        brandRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends Brand> entities) {
        brandRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        brandRepository.deleteAll();
    }
}
