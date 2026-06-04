package com.abhisek.management.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "backup_history")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BackupHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "backup_id")
    private Integer backupId;

    @ManyToOne
    @JoinColumn(name = "instance_id")
    private Instance instance;

    @Column(name = "backup_date")
    private LocalDateTime backupDate;

    @Column(name = "backup_file")
    private String backupFile;

    @Column(name = "backup_size")
    private String backupSize;

    private String duration;

    private String status;

    private String remarks;
}