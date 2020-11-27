package com.example.car.repair.shop2.app.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Mechanic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    private Seniority seniority;
    private Double salary;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Order order;

    public Mechanic() {
    }

    public Mechanic(String name, String surName, LocalDate birthDate, Seniority seniority, Double salary, Order order) {
        this.name = name;
        this.surName = surName;
        this.birthDate = birthDate;
        this.seniority = seniority;
        this.salary = salary;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public Mechanic setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Mechanic setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurName() {
        return surName;
    }

    public Mechanic setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Mechanic setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Seniority getSeniority() {
        return seniority;
    }

    public Mechanic setSeniority(Seniority seniority) {
        this.seniority = seniority;
        return this;
    }

    public Double getSalary() {
        return salary;
    }

    public Mechanic setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    public Order getOrder() {
        return order;
    }

    public Mechanic setOrder(Order order) {
        this.order = order;
        return this;
    }


}
