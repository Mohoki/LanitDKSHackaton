package ru.lanit.dks.hackaton.light.api.dto;

import javax.json.bind.annotation.JsonbProperty;
import java.util.Collection;

public class PersonWithCarsDto extends PersonDto {

    @JsonbProperty("cars")
    private Collection<CarDto> cars;

    public Collection<CarDto> getCars() {
        return cars;
    }

    public void setCars(Collection<CarDto> cars) {
        this.cars = cars;
    }

}
