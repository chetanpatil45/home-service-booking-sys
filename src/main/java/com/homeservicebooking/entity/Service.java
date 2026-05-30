package com.homeservicebooking.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String duration;
}
