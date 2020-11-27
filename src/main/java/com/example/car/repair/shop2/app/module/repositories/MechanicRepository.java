package com.example.car.repair.shop2.app.module.repositories;


import com.example.car.repair.shop2.app.core.model.Mechanic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicRepository extends JpaRepository <Mechanic, Long> {
}
