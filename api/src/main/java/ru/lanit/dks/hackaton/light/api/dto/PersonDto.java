package ru.lanit.dks.hackaton.light.api.dto;

import ru.lanit.dks.hackaton.light.api.BaseDto;

import javax.json.bind.annotation.JsonbProperty;
import java.util.Date;

public class PersonDto extends BaseDto {

    @JsonbProperty("name")
    private String name;

    @JsonbProperty("birthdate")
    private Date birthdate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date bithdate) {
        this.birthdate = bithdate;
    }

}
