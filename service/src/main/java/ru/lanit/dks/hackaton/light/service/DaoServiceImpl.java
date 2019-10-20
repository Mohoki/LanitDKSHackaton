package ru.lanit.dks.hackaton.light.service;

import ru.lanit.dks.hackaton.light.api.AddDtoException;
import ru.lanit.dks.hackaton.light.api.NoDtoFoundException;
import ru.lanit.dks.hackaton.light.api.dto.CarDto;
import ru.lanit.dks.hackaton.light.api.dto.PersonDto;
import ru.lanit.dks.hackaton.light.api.dto.PersonWithCarsDto;
import ru.lanit.dks.hackaton.light.api.dto.StatisticDto;
import ru.lanit.dks.hackaton.light.api.service.DaoService;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class DaoServiceImpl implements DaoService {

    @Override
    public void addPerson(PersonDto personDto) throws AddDtoException {

    }

    @Override
    public void addCar(CarDto carDto) throws AddDtoException {

    }

    @Override
    public PersonWithCarsDto getPersonWithCars(long id) throws NoDtoFoundException {
        return null;
    }

    @Override
    public StatisticDto getStatistics() {
        return null;
    }

    @Override
    public void clear() {

    }
}
