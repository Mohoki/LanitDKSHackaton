package ru.lanit.dks.hackaton.light.api.service.api;

import ru.lanit.dks.hackaton.light.api.AddDtoException;
import ru.lanit.dks.hackaton.light.api.dto.CarDto;

public interface CarService {

    void addCar(CarDto carDto) throws AddDtoException;

}
