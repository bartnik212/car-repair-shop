//package com.example.car.repair.shop2.app.core.model;
//
//import lombok.EqualsAndHashCode;
//import org.hibernate.annotations.Cascade;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//public class Car {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String registrationNumber;
//    private String brand;
//    private String model;
//    private TypeOfFuel typeOfFuel;
//    private Double engineCapacity;
//
//    @OneToMany(mappedBy = "car", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
//    @Cascade(value = org.hibernate.annotations.CascadeType.REMOVE)
//    @EqualsAndHashCode.Exclude
//    private Set<Order> orders;
//
//
//}
