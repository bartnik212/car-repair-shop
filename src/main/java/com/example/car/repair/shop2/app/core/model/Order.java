//package com.example.car.repair.shop2.app.core.model;
//
//import lombok.EqualsAndHashCode;
//import lombok.ToString;
//import org.hibernate.annotations.Cascade;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.util.Set;
//
//@Entity
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String content;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @EqualsAndHashCode.Exclude
//    @ToString.Exclude
//    private Car car;
//
//    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
//    @Cascade(value = org.hibernate.annotations.CascadeType.REMOVE)
//    @EqualsAndHashCode.Exclude
//    private Set<Mechanic> mechanics;
//
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private LocalDate timeStamp;
//
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private LocalDate dateOfOrderClosing;
//
//}
