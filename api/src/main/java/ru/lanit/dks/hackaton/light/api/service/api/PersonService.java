package ru.lanit.dks.hackaton.light.api.service.api;

import ru.lanit.dks.hackaton.light.api.AddDtoException;
import ru.lanit.dks.hackaton.light.api.NoDtoFound;
import ru.lanit.dks.hackaton.light.api.dto.PersonDto;
import ru.lanit.dks.hackaton.light.api.dto.PersonWithCarsDto;

public interface PersonService {

    void addPerson(PersonDto personDto) throws AddDtoException;

    PersonWithCarsDto getPersonWithCars(long id) throws NoDtoFound;

}
