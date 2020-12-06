package com.example.car.repair.shop2.app.core.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Mechanic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surName;

//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private LocalDate birthDate;

//    private Seniority seniority;
    private Double salary;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @EqualsAndHashCode.Exclude
//    @ToString.Exclude
//    private Order order;





}
