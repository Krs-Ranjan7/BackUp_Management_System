package com.abhisek.management.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "backup_schedule")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BackupSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private Integer scheduleId;

    @ManyToOne
    @JoinColumn(name = "instance_id")
    private Instance instance;

    @Column(name = "backup_datetime")
    private LocalDateTime backupDateTime;

    @Column(name = "backup_location")
    private String backupLocation;

    private String status;
}