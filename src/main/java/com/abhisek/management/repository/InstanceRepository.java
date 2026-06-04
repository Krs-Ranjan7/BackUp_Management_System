package com.abhisek.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhisek.management.entity.Instance;

public interface InstanceRepository
        extends JpaRepository<Instance, Integer> {

}