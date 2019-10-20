package ru.lanit.dks.hackaton.light.ejb;

import ru.lanit.dks.hackaton.light.api.AddDtoException;
import ru.lanit.dks.hackaton.light.api.dto.CarDto;
import ru.lanit.dks.hackaton.light.api.ejb.CarEjb;
import ru.lanit.dks.hackaton.light.api.service.DaoService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CarEjbBean implements CarEjb {

    @Inject
    public DaoService daoService;

    @Override
    public void addCar(CarDto carDto) throws AddDtoException {
        daoService.addCar(carDto);
    }
}
