package ru.lanit.dks.hackaton.light.api.dto;

import ru.lanit.dks.hackaton.light.api.BaseDto;

import javax.json.bind.annotation.JsonbProperty;

public class PersonDto extends BaseDto {

    @JsonbProperty("name")
    private String name;

    @JsonbProperty("birthdate")
    private String birthdate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String bithdate) {
        this.birthdate = bithdate;
    }

}
