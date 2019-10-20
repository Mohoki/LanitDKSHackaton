package ru.lanit.dks.hackaton.light.ejb;

import ru.lanit.dks.hackaton.light.api.AddDtoException;
import ru.lanit.dks.hackaton.light.api.NoDtoFoundException;
import ru.lanit.dks.hackaton.light.api.dto.PersonDto;
import ru.lanit.dks.hackaton.light.api.dto.PersonWithCarsDto;
import ru.lanit.dks.hackaton.light.api.ejb.PersonEjb;
import ru.lanit.dks.hackaton.light.api.service.DaoService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class PersonEjbBean implements PersonEjb {

    @Inject
    public DaoService daoService;

    @Override
    public void addPerson(PersonDto personDto) throws AddDtoException {
        daoService.addPerson(personDto);
    }

    @Override
    public PersonWithCarsDto getPersonWithCars(long id) throws NoDtoFoundException {
        return daoService.getPersonWithCars(id);
    }
}
