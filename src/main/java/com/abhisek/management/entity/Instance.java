package com.abhisek.management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "instances")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Instance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instance_id")
    private Integer instanceId;

    @Column(name = "instance_name")
    private String instanceName;

    @Column(name = "database_name")
    private String databaseName;

    @Column(name = "ip_address")
    private String ipAddress;

    private Integer port;

    @Column(name = "db_username")
    private String dbUsername;

    @Column(name = "db_password")
    private String dbPassword;

    private String status;
}