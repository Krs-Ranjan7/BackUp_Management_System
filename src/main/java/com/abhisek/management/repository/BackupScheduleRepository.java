package com.abhisek.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhisek.management.entity.BackupSchedule;

public interface BackupScheduleRepository
        extends JpaRepository<BackupSchedule, Integer> {

}