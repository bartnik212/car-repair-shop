package com.example.car.repair.shop2.app.module.serviceMechanic;


import com.example.car.repair.shop2.app.core.model.Mechanic;
import com.example.car.repair.shop2.app.module.repositories.MechanicRepository;
import org.springframework.stereotype.Service;

@Service
public class MechanicService {

    private final MechanicRepository mechanicRepository;

    public MechanicService(MechanicRepository mechanicRepository) {
        this.mechanicRepository = mechanicRepository;
    }

    public void save (Mechanic mechanic) {
       mechanicRepository.save(mechanic);
   }
}
