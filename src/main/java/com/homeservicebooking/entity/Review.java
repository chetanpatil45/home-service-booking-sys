package com.homeservicebooking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")
public class Review {
    private Long id;
    private Integer rating;
    private String comment;
}
