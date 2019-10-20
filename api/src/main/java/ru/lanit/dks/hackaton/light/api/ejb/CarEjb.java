package ru.lanit.dks.hackaton.light.api.ejb;

import ru.lanit.dks.hackaton.light.api.AddDtoException;
import ru.lanit.dks.hackaton.light.api.dto.CarDto;
import ru.lanit.dks.hackaton.light.api.service.api.CarService;

import javax.ejb.Remote;

@Remote
public interface CarEjb extends CarService {
}
