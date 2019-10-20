package ru.lanit.dks.hackaton.light.service.jpa.dao;

import ru.lanit.dks.hackaton.light.api.dto.CarDto;
import ru.lanit.dks.hackaton.light.service.jpa.model.Car;
import ru.lanit.dks.hackaton.light.service.jpa.model.CarVendor;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.Set;

@RequestScoped
public class CarDaoImpl implements CarDao {

    @PersistenceContext(name = "HDKSPersistenceUnit")
    private EntityManager entityManager;

    public Car getCar(Long id) {
        return entityManager.find(Car.class, id);
    }

    public Set<Car> getVendorCars(Long vendorId) {
        final CarVendor carVendor = entityManager.find(CarVendor.class, vendorId);
        if (carVendor != null) {
            return new HashSet<>(carVendor.getCars());
        }
        return new HashSet<>(0);
    }

}
