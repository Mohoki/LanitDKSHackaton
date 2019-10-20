package ru.lanit.dks.hackaton.light.api.dto;

import ru.lanit.dks.hackaton.light.api.BaseDto;

import javax.json.bind.annotation.JsonbProperty;

public class CarDto extends BaseDto {

    @JsonbProperty("model")
    private String model;

    @JsonbProperty("horsepower")
    private Integer horsePower;

    @JsonbProperty("ownerId")
    private Long ownerId;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

}
