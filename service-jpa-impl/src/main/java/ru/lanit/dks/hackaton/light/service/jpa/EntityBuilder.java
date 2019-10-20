package ru.lanit.dks.hackaton.light.service.jpa;

import ru.lanit.dks.hackaton.light.api.dto.CarDto;
import ru.lanit.dks.hackaton.light.service.jpa.dao.CarDao;
import ru.lanit.dks.hackaton.light.service.jpa.dao.PersonDao;
import ru.lanit.dks.hackaton.light.service.jpa.model.Car;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class EntityBuilder {

    @Inject
    private CarDao carDao;

    @Inject
    private PersonDao personDao;

    public Car build(final CarDto carDto) {
        final Car car = new Car();
        car.setId(carDto.getId());
        car.setHorsePower(carDto.getHorsePower());
        car.setPerson(personDao.getPerson(carDto.getOwnerId()));
        // TODO: more
        return car;
    }

}
